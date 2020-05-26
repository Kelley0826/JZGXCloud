package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZBFEmployeeDO;
import io.iec.caf.data.jpa.repository.CafJpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description: 行政人员mapper（数据库操作类）
 * Author: sakura sun (sunchao)
 * Date:  2019/8/27 15:47
 * Company: Inspur
 */
@Repository
    public interface JZBFEmployeeRepository extends CafJpaRepository<JZBFEmployeeDO,String> {

    /**
     * Description: 获取默认行政人员信息
     * @Param: [employeeId]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFEmployeeDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/8/27 15:52
     */
    @Deprecated
    @Query(value = "select o.id,o.code,o.name,o.contactinfo,o.email,o.confidentiallevel,o.idNumber,o.identityType,o.countryOrAera,o.location,o.organization,o.displayName,o.gender,o.state_isenabled,o.sysuser from JZBFEmployeeDO o where o.id = ?1 ")
    JZBFEmployeeDO getDefaultEmployeeInfo(String employeeId);
    /**
     * Description: 根据 用户内码 获取行政人员信息
     * @Param: [userId]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFEmployeeDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/8/27 16:02
     */
    @Query(value = "select o from JZBFEmployeeDO o where o.sysuser = ?1 ")
    JZBFEmployeeDO getAllInfo(String userId);

    /**
     * Description: 根据系统用户获取所有行政人员LIst实体
     * @Param: [userId]
     * @Return: java.util.List<com.inspur.gs.fssp.common.foundation.entity.BFEmployeeDO>
     * @Author: sakura sun (sunchao)
     * @Date: 2020/3/11 10:22
     */
    @Query("select  o from JZBFEmployeeDO o where o.id in (select t.parentid from JZBFEmployeeSysuserDTO t where t.sysuser=?1)")
    List<JZBFEmployeeDO> getEmployeeByUserid(String userId);
    /**
     * Description: 根据用户ID获得行政人员ID,行政人员姓名
     * @Param: [userID]
     * @Return: java.lang.String
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2019/8/31 14:17
     */
    @Query(value = "select o.ID,o.name_chs from bfemployee o where o.sysuser = ?1 ", nativeQuery = true)
    List<Object[]> getBFEmployeeIDAndNameByUserId(String userID);

    /**
     * Description: 根据用户ID获取行政人员信息
     * @Param: [userID]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFEmployeeDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/9/2 9:15
     */
    @Query(value = "select o from JZBFEmployeeDO o where o.sysuser = ?1 ")
    JZBFEmployeeDO getDefaultEmployeeInfoByUserId(String userID);

    /**
     * Description: 根据行政人员ID获取行政人员信息
     * @Param: [id]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFEmployeeDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/9/21 16:09
     */
    @Query(value = "select o from JZBFEmployeeDO o where o.id = ?1 ")
    JZBFEmployeeDO getEmployeeInfoById(String id);

    /**
     * Description: 根据行政人员ID，部门ID查询所有的行政人员ID
     * @Param: [var1, var2, var3]行政人员ID,行政人员ID数组，单位内码数组
     * @Return: java.lang.Object[]
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2019/10/16 10:53
     */
    @Query(value = "select id from bfemployee where id = :strnm or id in (:wtrid) or organization in (:wtbmid)", nativeQuery = true)
    Object[] getYGNMList(@Param("strnm") String strnm, @Param("wtrid") List<String> wtrid, @Param("wtbmid") List<String> wtbmid);

    /**
     * Description: 根据行政人员ID获得组织ID
     * @Param: [ExecutiveId] :行政人员ID
     * @Return: java.lang.String
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2019/10/21 13:51
     */
    @Query(value = "SELECT ORGANIZATION FROM BFEMPLOYEE WHERE ID = ?1", nativeQuery = true)
    Object[] getOrganizationIDByEmployeeID(String ExecutiveId);

    /**
     * Description: 根据组织ID获得行政人员信息
     * @Param: [ExecutiveId] :组织ID
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFEmployeeDO
     * @Author: 施云龙 (shiyunlong)
     * @Date: 2020/03/09 18:19
     */
    @Query(value = "SELECT o FROM JZBFEmployeeDO o WHERE o.organization = ?1 AND o.state_isenabled = '1'")
    List<JZBFEmployeeDO> findEmployeeInfoByOrganizationID(String organizationID);

}
