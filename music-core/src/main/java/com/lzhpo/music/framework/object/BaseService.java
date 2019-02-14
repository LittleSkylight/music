package com.lzhpo.music.framework.object;

/**
 * 公共业务接口类
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
public interface BaseService<T, PK> {

    /**
     * 保存一个实体，null的属性不会保存，会使用数据库默认值
     *
     * @param entity
     *         实体业务对象
     * @return 当前实体业务对象
     */
    T insert(T entity);

    /**
     * 根据主键字段进行删除，方法参数必须包含完整的主键属性
     *
     * @param primaryKey
     *         主键
     * @return true: 删除成功 false: 删除失败
     */
    boolean removeByPrimaryKey(PK primaryKey);

    /**
     * 根据主键更新属性不为null的值
     *
     * @param entity
     *         实体业务对象
     * @return true: 更新成功 false: 更新失败
     */
    boolean updateSelective(T entity);

    /**
     * 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
     *
     * @param primaryKey
     *         主键
     * @return 业务对象
     */
    T getByPrimaryKey(PK primaryKey);
}