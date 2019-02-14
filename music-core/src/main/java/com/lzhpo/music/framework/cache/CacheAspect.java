package com.lzhpo.music.framework.cache;

import com.lzhpo.music.util.AspectUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
@Slf4j
@Aspect
@Component
public class CacheAspect {

    @Autowired
    CustomeCache customeCache;

    @Pointcut(value = "@annotation(com.lzhpo.music.framework.cache.Cache)")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object handle(ProceedingJoinPoint point) throws Throwable {
        Method currentMethod = AspectUtil.getMethod(point);
        //获取操作名称
        Cache cache = currentMethod.getAnnotation(Cache.class);
        String key = AspectUtil.getKey(point, cache.key(), "");
        boolean hasKey = customeCache.contains(key);
        if (hasKey) {
            try {
                log.info("{}从缓存中获取数据", key);
                return customeCache.getCache(key);
            } catch (Exception e) {
                log.error("从缓存中获取数据失败！", e);
            }
        }
        //先执行业务
        Object result = point.proceed();
        customeCache.setCache(key, result, cache.unit().toMillis(cache.expire()));
        log.info("{}从数据库中获取数据", key);
        return result;
    }

}
