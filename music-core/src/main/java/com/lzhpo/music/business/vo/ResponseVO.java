package com.lzhpo.music.business.vo;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.lzhpo.music.business.enums.ResponseStatusEnum;
import lombok.Data;

import java.util.Collection;
import java.util.List;

/**
 * 接口返回实体对象
 *
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
@Data
public class ResponseVO<T> {
    private Integer status;
    private String message;
    private T data;

    public ResponseVO(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResponseVO(ResponseStatusEnum status) {
        this.status = status.getCode();
        this.message = status.getMessage();
        this.data = null;
    }

    public ResponseVO(ResponseStatusEnum status, T data) {
        this(status.getCode(), status.getMessage(), data);
    }

    public String toJson() {
        T t = this.getData();
        if (t instanceof List || t instanceof Collection) {
            return JSONObject.toJSONString(this, SerializerFeature.WriteNullListAsEmpty);
        } else {
            return JSONObject.toJSONString(this, SerializerFeature.WriteMapNullValue);
        }
    }
}
