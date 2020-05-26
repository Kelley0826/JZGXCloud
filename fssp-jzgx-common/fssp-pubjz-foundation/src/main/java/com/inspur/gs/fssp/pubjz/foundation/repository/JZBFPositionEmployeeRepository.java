package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZBFPositionEmployeeDO;
import io.iec.edp.caf.data.orm.DataRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description: 职位Mapper（数据库操作）
 * Author: gongfei
 * Date:  2019/12/14 9:14
 * Company: Inspur
 */
public interface JZBFPositionEmployeeRepository extends DataRepository<JZBFPositionEmployeeDO,String> {

    /**
     * Description: 获取职位全部信息
     * @Param: [positionId]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFPositionDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/8/28 9:16
     */
    @Query(value = "select o from JZBFPositionEmployeeDO o where o.id = ?1 ")
    JZBFPositionEmployeeDO getBFPositionEmployeeDO(String positionId);

    /**
     * Description: 获取职位全部信息
     * @Param: [positionId]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFPositionDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/8/28 9:16
     */
    @Query(value = "select o from JZBFPositionEmployeeDO o where o.parentid = ?1 ")
    List<JZBFPositionEmployeeDO> getBFPositionEmployeeDOSByPosition(String positionId);
}
