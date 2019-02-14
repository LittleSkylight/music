package com.lzhpo.music.business.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzhpo.music.business.enums.MusicStatusEnum;
import com.lzhpo.music.business.vo.WangyiPlayConditionVO;
import com.lzhpo.music.business.model.WangyiPlay;
import com.lzhpo.music.business.service.WangyiPlayService;
import com.lzhpo.music.persistence.beans.BizWangyiPlay;
import com.lzhpo.music.persistence.mapper.BizWangyiPlayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
@Service
public class WangyiPlayServiceImpl implements WangyiPlayService {

    @Autowired
    private BizWangyiPlayMapper wangyiPlayMapper;

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    @Override
    public PageInfo<WangyiPlay> findPageBreakByCondition(WangyiPlayConditionVO vo) {
        PageHelper.startPage(vo.getPageNumber(), vo.getPageSize());
        List<BizWangyiPlay> list = wangyiPlayMapper.selectAll();
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        List<WangyiPlay> boList = new ArrayList<>();
        for (BizWangyiPlay bizWangyiPlay : list) {
            boList.add(new WangyiPlay(bizWangyiPlay));
        }
        PageInfo bean = new PageInfo<BizWangyiPlay>(list);
        bean.setList(boList);
        return bean;
    }

    /**
     * 获取默认的歌单
     *
     * @return
     */
    @Override
    public WangyiPlay getDefault() {
        WangyiPlay play = new WangyiPlay();
        play.setStatus(MusicStatusEnum.DEFAULT);
        BizWangyiPlay bizWangyiPlay = wangyiPlayMapper.selectOne(play.getBizWangyiPlay());
        return null == bizWangyiPlay ? null : new WangyiPlay(bizWangyiPlay);
    }

    /**
     * 保存一个实体，null的属性不会保存，会使用数据库默认值
     *
     * @param entity
     *         实体业务对象
     * @return 当前实体业务对象
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public WangyiPlay insert(WangyiPlay entity) {
        Assert.notNull(entity, "WangyiPlay不可为空！");
        entity.setUpdateTime(new Date());
        entity.setCreateTime(new Date());
        wangyiPlayMapper.insertSelective(entity.getBizWangyiPlay());
        return entity;
    }

    /**
     * 根据主键字段进行删除，方法参数必须包含完整的主键属性
     *
     * @param primaryKey
     *         主键
     * @return true: 删除成功 false: 删除失败
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean removeByPrimaryKey(Integer primaryKey) {
        return wangyiPlayMapper.deleteByPrimaryKey(primaryKey) > 0;
    }

    /**
     * 根据主键更新属性不为null的值
     *
     * @param entity
     *         实体业务对象
     * @return true: 更新成功 false: 更新失败
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateSelective(WangyiPlay entity) {
        Assert.notNull(entity, "WangyiPlay不可为空！");
        entity.setUpdateTime(new Date());
        return wangyiPlayMapper.updateByPrimaryKey(entity.getBizWangyiPlay()) > 0;
    }

    /**
     * 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
     *
     * @param primaryKey
     *         主键
     * @return 业务对象
     */
    @Override
    public WangyiPlay getByPrimaryKey(Integer primaryKey) {
        Assert.notNull(primaryKey, "PrimaryKey不可为空！");
        BizWangyiPlay entity = wangyiPlayMapper.selectByPrimaryKey(primaryKey);
        return null == entity ? null : new WangyiPlay(entity);
    }

}
