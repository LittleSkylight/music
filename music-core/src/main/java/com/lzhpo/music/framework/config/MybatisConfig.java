package com.lzhpo.music.framework.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
@Component
@MapperScan("com.lzhpo.music.persistence.mapper")
public class MybatisConfig {
}
