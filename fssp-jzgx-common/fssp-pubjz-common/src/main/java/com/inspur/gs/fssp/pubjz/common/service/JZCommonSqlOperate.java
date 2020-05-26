package com.inspur.gs.fssp.pubjz.common.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tangchm01
 * @since version 1.0.0.0
 */
public interface JZCommonSqlOperate {

    /**
     * 插入操作接口
     *
     * @param objList  (数据实体)  规定为List<实体> （以便支持批量插入）
     * @param info （info.tableCode 表名   info.keysList  List类型 可以多个主键、可以缺省）
     * @return
     */
    public int insert(List<Object> objList, Map<String, Object> info);

    /**
     * 查询操作接口
     *
     * @param c    （查询字段构造实体类指向类）
     * @param info （info.tableCode 表名  info.filter  string类型 可以缺省最好提供 为完整的过滤条件 如 where 1=1 ）
     * @return
     */
    public HashMap query(Class c, Map<String, Object> info);

    /**
     * 更新操作接口
     *
     * @param objList  (更新的数据实体  可以只赋值需要更新的字段)  规定为List<实体> （以便支持批量修改）
     * @param info （info.tableCode 表名  info.fieldsList  List类型 需要更新的字段(缺省时默认全部更新)  info.filter   string类型 可以缺省最好提供 为完整的过滤条件 如  where 1=1  ）
     * @return
     */
    public int update(List<Object> objList, Map<String, Object> info);

    /**
     * 删除操作接口
     *
     * @param info （info.tableCode 表名  info.filter string类型 不可缺省 为完整的过滤条件 如 where 1=1 ）
     * @return
     */
    public int delete(Map<String, Object> info);
}
