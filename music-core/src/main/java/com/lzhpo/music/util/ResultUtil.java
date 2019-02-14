package com.lzhpo.music.util;

import com.github.pagehelper.PageInfo;
import com.lzhpo.music.business.enums.ResponseStatusEnum;
import com.lzhpo.music.business.vo.ResponseVO;
import com.lzhpo.music.business.consts.CommonConst;
import com.lzhpo.music.framework.object.PageResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
public class ResultUtil {

    public static ModelAndView view(String view) {
        return new ModelAndView(view);
    }

    public static ModelAndView view(String view, Map<String, Object> model) {
        return new ModelAndView(view, model);
    }

    public static ModelAndView redirect(String view) {
        return new ModelAndView("redirect:" + view);
    }

    public static ResponseVO error(int code, String message) {
        return vo(code, message, null);
    }

    public static ResponseVO error(ResponseStatusEnum status) {
        return vo(status.getCode(), status.getMessage(), null);
    }

    public static ResponseVO error(String message) {
        return vo(CommonConst.DEFAULT_RESPONSE_ERROR, message, null);
    }

    public static ResponseVO success(String message, Object data) {
        return vo(CommonConst.DEFAULT_RESPONSE_OK, message, data);
    }

    public static ResponseVO success(String message) {
        return success(message, null);
    }

    public static ResponseVO success(ResponseStatusEnum status) {
        return vo(status.getCode(), status.getMessage(), null);
    }

    public static ResponseVO success(ResponseStatusEnum status, String data) {
        return vo(status.getCode(), status.getMessage(), data);
    }

    public static ResponseVO vo(int code, String message, Object data) {
        return new ResponseVO<>(code, message, data);
    }

    public static PageResult tablePage(Long total, List<?> list) {
        return new PageResult(total, list);
    }

    public static PageResult tablePage(PageInfo info) {
        if (info == null) {
            return new PageResult(0L, new ArrayList());
        }
        return tablePage(info.getTotal(), info.getList());
    }
}
