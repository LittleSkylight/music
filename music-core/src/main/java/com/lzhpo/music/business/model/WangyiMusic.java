package com.lzhpo.music.business.model;

import lombok.Data;

/**
 * 网易云音乐实体类
 *
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
@Data
public class WangyiMusic {
    /**
     * 歌曲id
     */
    private String id;
    /**
     * 歌曲名
     */
    private String name;
    /**
     * 演唱者
     */
    private String author;
    /**
     * 演唱者封面
     */
    private String authorImg;
    /**
     * 专辑
     */
    private String albumName;
    /**
     * 专辑封面
     */
    private String albumImg;
    /**
     * 歌曲地址
     */
    private String url;

    public WangyiMusic() {

    }

    public WangyiMusic(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
