package com.lzhpo.music.business.service;

import com.github.pagehelper.PageInfo;
import com.lzhpo.music.business.vo.WangyiPlayConditionVO;
import com.lzhpo.music.business.model.WangyiPlay;
import com.lzhpo.music.framework.object.BaseService;

/**
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
public interface WangyiPlayService extends BaseService<WangyiPlay, Integer> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<WangyiPlay> findPageBreakByCondition(WangyiPlayConditionVO vo);

    /**
     * 获取默认的歌单
     *
     * @return
     */
    WangyiPlay getDefault();
}
