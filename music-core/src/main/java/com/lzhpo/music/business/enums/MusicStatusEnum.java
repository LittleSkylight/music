package com.lzhpo.music.business.enums;

/**
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
public enum MusicStatusEnum {

    DISABLE(-1),
    DEFAULT(1),
    NORMAL(0);
    private int code;

    MusicStatusEnum(int code) {
        this.code = code;
    }

    public static MusicStatusEnum getStatus(Integer code) {
        if (null == code) {
            return null;
        }
        MusicStatusEnum[] statusArr = MusicStatusEnum.values();
        for (MusicStatusEnum musicStatusEnum : statusArr) {
            if (musicStatusEnum.getCode() == code) {
                return musicStatusEnum;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }
}
