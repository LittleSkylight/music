package com.lzhpo.music.business.enums;

/**
 * 公共的状态枚举类
 *
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
public enum ResponseStatusEnum {

    SUCCESS(200, "操作成功！"),
    ERROR(500, "服务器未知错误！"),
    UNAUTHORIZED(401, "尚未登录！"),
    FORBIDDEN(403, "您没有操作权限！"),
    NOT_FOUND(404, "资源不存在！"),
    LOGIN_ERROR(10001, "账号或密码错误！"),
    USER_EXIST(10002, "已存在的用户！"),
    INVALID_AUTHCODE(10003, "手机验证码无效！"),
    INVALID_TOKEN(10004, "无效的TOKEN，您没有操作权限！"),
    INVALID_ACCESS(10005, "无效的请求，该请求已过期！");

    private Integer code;
    private String message;

    ResponseStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
