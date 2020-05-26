package com.inspur.gs.fssp.pubjz.foundation.repository;

import org.hibernate.SQLQuery;
import org.hibernate.query.internal.NativeQueryImpl;
import org.hibernate.query.spi.NativeQueryImplementor;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Description:核算组织
 * Author: sun mingzhi
 * Date:  2019/10/15 15:20
 * Company: Inspur
 */
@Repository
public class JZBFAccountingOrganizationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Description: 通过报账组织内码获得核算组织你内码
     * @Param: [adid]
     * @Return: java.lang.String
     */
    public String getBFAccountingOrganizationIdByadid(String adid) {
        Query query = entityManager.createNativeQuery("SELECT o.id FROM BFAccountingOrganization  o WHERE o.adminorgid=?1 ");
        query.setParameter(1, adid);
        List<String> userInfo = query.getResultList();
        if (userInfo.size() > 0) {
            return userInfo.get(0);
        }
        return null;
    }



    /**
     * Description: 根据行政人员内码获得核算人员的内码，编号，名称
     * @Param: [tableName, adminemployeeid]
     * @Return: java.lang.String[]
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2019/11/11 14:20
     */
    public Map<String,Object> getAccountempByAdminEmployeeId(String tableName,String employeeid){
        String str = "SELECT id,code,name FROM " + tableName + " WHERE adminemployeeid= '" + employeeid+"'";
        Query query = entityManager.createNativeQuery(str);
//        query.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List<Map<String,Object>> userInfo = query.getResultList();
        if (userInfo.size() > 0) {
            return userInfo.get(0);
        }
        return null;
    }

    /**
     * 根据组织机构id获取纳税人识别号
     * @param orgID
     * @return
     */
    public Map<String,Object> getTaxIDByAdminOrgId(String orgID ){
        String str = "SELECT namefortax \"namefortax\",organizationcode \"organizationcode\" FROM bfmasterorganization WHERE id= '" + orgID+"'";
        Query query = entityManager.createNativeQuery(str);
//        query.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List<Map<String,Object>> userInfo = query.getResultList();
        if (userInfo.size() > 0) {
            return userInfo.get(0);
        }
        return null;
    }

    /**
     * 根据核算单位id获取组织机构id
     * @param orgID
     * @return
     */
    public Map<String,Object> getMasterOrgIDByAccountingOrg(String orgID ){
        String str = "SELECT adminorgid \"adminorgid\" FROM bfaccountingorganization WHERE id= '" + orgID+"'";
        Query query = entityManager.createNativeQuery(str);
//        query.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List<Map<String,Object>> orgInfo = query.getResultList();
        if (orgInfo.size() > 0) {
            return orgInfo.get(0);
        }
        return null;
    }

}
