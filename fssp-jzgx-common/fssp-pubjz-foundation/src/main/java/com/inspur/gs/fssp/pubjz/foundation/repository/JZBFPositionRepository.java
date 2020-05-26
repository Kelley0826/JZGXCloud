package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZBFPositionDO;
import io.iec.edp.caf.data.orm.DataRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description: 职位Mapper（数据库操作）
 * Author: sakura sun (sunchao)
 * Date:  2019/8/28 9:14
 * Company: Inspur
 */
@Repository
public interface JZBFPositionRepository extends DataRepository<JZBFPositionDO,String> {

    /**
     * Description: 获取职位全部信息
     * @Param: [positionId]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFPositionDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/8/28 9:16
     */
    @Query(value = "select o from JZBFPositionDO o where o.id = ?1 ")
    JZBFPositionDO getPositionAllInfo(String positionId);

    /**
     * Description: 获取职位信息
     * @Param: [positionId]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFPositionDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/8/28 9:17
     */
    @Query(value = "select o.id,o.code,o.name_chs from JZBFPositionDO o where o.id = ?1 ")
    JZBFPositionDO getPositionInfo(String positionId);

    /**
     * Description: 获取职位信息
     * @Param: [ofpostid]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFPositionDO
     * @Author: gongfei
     * @Date: 2019/11/13 10:17
     */
    @Query(value = "select o from JZBFPositionDO o where o.ofpost = ?1 ")
    List<JZBFPositionDO> listPositionAllInfoByOfpostid(String ofpostid);


    /**
     * Description: 获取启用的职位信息
     * @Param: [positionId] 职位内码
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFPositionDO
     * @Author: gongfei
     * @Date: 2020-03-30 10:21:00
     */
    @Query(value = "select o from JZBFPositionDO o where o.id = ?1 and o.state_isenabled = '1' ")
    JZBFPositionDO getEnabledPositionAllInfo(String positionId);
}
