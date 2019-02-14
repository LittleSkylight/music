package com.lzhpo.music.persistence.beans;

import com.lzhpo.music.framework.object.BaseDO;
import lombok.Data;

/**
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
@Data
public class BizWangyiPlay extends BaseDO {
    private String playId;
    private String playName;
    private Integer status;
}
