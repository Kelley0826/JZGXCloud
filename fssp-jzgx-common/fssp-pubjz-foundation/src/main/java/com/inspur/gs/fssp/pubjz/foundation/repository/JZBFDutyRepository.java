package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZBFDutyDO;
import io.iec.edp.caf.data.orm.DataRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA
 * Description: 职务Mapper（数据库操作）
 * Author: sakura sun (sunchao)
 * Date:  2019/8/28 9:07
 * Company: Inspur
 */
@Repository
public interface JZBFDutyRepository extends DataRepository<JZBFDutyDO,String> {

    /**
     * Description: 获取职务信息
     * @Param: [dutyId]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFDutyDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/8/28 9:11
     */
    @Query(value = "select o.id,o.code,o.name_chs from JZBFDutyDO o where o.id = ?1 ")
    JZBFDutyDO getDutyInfo(String dutyId);

    /**
     * Description: 获取职务全部信息
     * @Param: [dutyId]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFDutyDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/8/28 9:11
     */
    @Query(value = "select o from JZBFDutyDO o where o.id = ?1 ")
    JZBFDutyDO getDutyAllInfo(String dutyId);

    /**
     * Description: 获取 启用的 职务全部信息
     * @Param: [dutyId]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFDutyDO
     * @Author: gongfei
     * @Date: 2020-03-30 10:22:53
     */
    @Query(value = "select o from JZBFDutyDO o where o.id = ?1 and o.state_isenabled = '1' ")
    JZBFDutyDO getEnabledDutyAllInfo(String dutyId);
}
