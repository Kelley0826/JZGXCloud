package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZBFAdminOrganizationDO;
import io.iec.caf.data.jpa.repository.CafJpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description: 行政组织Mapper（数据库操作类）
 * Author: sakura sun (sunchao)
 * Date:  2019/8/27 16:55
 * Company: Inspur
 */
@Repository
public interface JZBFAdminOrganizationRepository extends CafJpaRepository<JZBFAdminOrganizationDO, String> {
    @PersistenceContext
    /**
     * Description: 获取行政组织单位信息
     * @Param: [organizationId]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFAdminOrganizationDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/8/28 8:56
     */
//    @Query(value = "select o.id,o.code,o.name_chs,o.departmenthead,o.departmentheadName,o.representative,o.masterorgid,o.ownerid from BFAdminOrganizationDO o where o.id = ?1 and o.orgType = '9edf25d1-b991-4dde-90b9-30145422d24d' ")
    @Query(value = "select o from JZBFAdminOrganizationDO o where o.id = ?1 and o.orgType = '9edf25d1-b991-4dde-90b9-30145422d24d' ")
    JZBFAdminOrganizationDO getBFAdminOrganizationDW(String organizationId);

    /**
     * Description: 获取行政组织部门信息
     *
     * @Param: [organizationId]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFAdminOrganizationDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/8/28 9:02
     */
//    @Query(value = "select o.id,o.code,o.name_chs,o.departmenthead,o.departmentheadName,o.representative,o.masterorgid,o.ownerid from BFAdminOrganizationDO o where o.id = ?1 and o.orgType = '33c21504-3384-42a7-8fc3-c1b5e9e982d0' ")
    @Query(value = "select o from JZBFAdminOrganizationDO o where o.id = ?1 and o.orgType = '33c21504-3384-42a7-8fc3-c1b5e9e982d0' ")
    JZBFAdminOrganizationDO getBFAdminOrganizationBM(String organizationId);

    /**
     * Description:根据部门ID获得单位ID
     * @Param: [organizationId]
     * @Return: java.lang.String
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2019/8/31 15:27
     */
    @Query(value = "select o.ownerid from BFAdminOrganization o where o.id = ?1  and o.orgType = '33c21504-3384-42a7-8fc3-c1b5e9e982d0'", nativeQuery = true)
    ArrayList<String> getOrganizationIDByBMId(String organizationId);

    /**
     * Description: 通过行政人员ID获得部门和组织ID
     * @Param: [ExecutiveId]:行政人员ID获得部门和组织ID
     * @Return: java.util.ArrayList<java.lang.String[]>
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2019/9/12 8:57
     */
    @Query(value = "select bfemployee.organization , bfadminorganization.ownerid from bfemployee  left join bfadminorganization on bfemployee.organization=bfadminorganization.id where bfadminorganization.orgType = '33c21504-3384-42a7-8fc3-c1b5e9e982d0' and bfemployee.id = ?1", nativeQuery = true)
    ArrayList<Object[]> getbmIdAnddwIdByExecutiveId(String ExecutiveId);

    /**
     * Description: 根据组织ID获得该组织信息，可能是部门也可能是单位
     * @Param: [organizationId]:组织ID
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFAdminOrganizationDO
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2019/10/21 14:05
     */
    @Query(value = " select o from JZBFAdminOrganizationDO o where id = ?1")
    JZBFAdminOrganizationDO getBFAdminOrganizationDWOrBM(String organizationId);

    /**
     * Description: 根据单位ID数组获得部门ID数组:委托管理，报销账户管理使用
     * @Param: [orgidList]
     * @Return: java.util.ArrayList<java.lang.String>
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2020/2/12 10:42
     */
    @Query(value = "select id from BFAdminOrganization where ownerid in(?1) and  orgType = '33c21504-3384-42a7-8fc3-c1b5e9e982d0'",nativeQuery = true)
    List<String> getdepidListByOrgidList(List<String> orgidList);

    /**
     * Description: 根据单位ID数组和部门ID数组获得全部部门ID数组：委托管理，报销账户管理使用
     * @Param: [orgidList]
     * @Return: java.util.ArrayList<java.lang.String>
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2020/2/12 10:42
     */
    @Query(value = "select id from BFAdminOrganization where ownerid in(?1) and id in (?2) and orgType = '33c21504-3384-42a7-8fc3-c1b5e9e982d0'",nativeQuery = true)
    List<String> getdepidListByOrgAndDepidList(List<String> orgidList,List<String> depidList);
    /**
     * Description: 获取全部部门ID
     * @Param: [orgidList, depidList]
     * @Return: java.util.List<java.lang.String>
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2020/2/13 14:43
     */
    @Query(value = "select id from BFAdminOrganization where  orgType = '33c21504-3384-42a7-8fc3-c1b5e9e982d0'",nativeQuery = true)
    List<String> getalldepidList();

    /**
     * Description: 根据行政组织获取主组织id
     * @Param: [id]
     * @Return: java.lang.String
     * @Author: sakura sun (sunchao)
     * @Date: 2020/2/25 10:28
     */
    @Query(value = "select masterorgid from BFAdminOrganization where  orgType = '9edf25d1-b991-4dde-90b9-30145422d24d' and id = ?1" ,nativeQuery = true)
    String getmasterorgid(String id);

}
