package com.lzhpo.music.business.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lzhpo.music.business.enums.MusicStatusEnum;
import com.lzhpo.music.persistence.beans.BizWangyiPlay;

import java.util.Date;

/**
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
public class WangyiPlay {
    private BizWangyiPlay bizWangyiPlay;

    public WangyiPlay() {
        this.bizWangyiPlay = new BizWangyiPlay();
    }

    public WangyiPlay(BizWangyiPlay bizWangyiPlay) {
        this.bizWangyiPlay = bizWangyiPlay;
    }

    @JsonIgnore
    public BizWangyiPlay getBizWangyiPlay() {
        return bizWangyiPlay;
    }

    public void setBizWangyiPlay(BizWangyiPlay bizWangyiPlay) {
        this.bizWangyiPlay = bizWangyiPlay;
    }

    public Integer getId() {
        return this.bizWangyiPlay.getId();
    }

    public void setId(Integer id) {
        this.bizWangyiPlay.setId(id);
    }

    public String getPlayId() {
        return this.bizWangyiPlay.getPlayId();
    }

    public void setPlayId(String name) {
        this.bizWangyiPlay.setPlayId(name);
    }

    public String getPlayName() {
        return this.bizWangyiPlay.getPlayName();
    }

    public void setPlayName(String name) {
        this.bizWangyiPlay.setPlayName(name);
    }

    public Integer getStatus() {
        return this.bizWangyiPlay.getStatus();
    }

    public void setStatus(MusicStatusEnum status) {
        if (null == status) {
            return;
        }
        this.bizWangyiPlay.setStatus(status.getCode());
    }

    public void setStatus(Integer status) {
        this.bizWangyiPlay.setStatus(status);
    }

    public Date getCreateTime() {
        return this.bizWangyiPlay.getCreateTime();
    }

    public void setCreateTime(Date createTime) {
        this.bizWangyiPlay.setCreateTime(createTime);
    }

    public Date getUpdateTime() {
        return this.bizWangyiPlay.getUpdateTime();
    }

    public void setUpdateTime(Date updateTime) {
        this.bizWangyiPlay.setUpdateTime(updateTime);
    }
}
