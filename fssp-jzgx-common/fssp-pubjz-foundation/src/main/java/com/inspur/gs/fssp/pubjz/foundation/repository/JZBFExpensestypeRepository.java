package com.inspur.gs.fssp.pubjz.foundation.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * 费用项目
 * @author jiangshaoshuai
 * @since 2019/12/9 17:58
 */
@Repository
public class JZBFExpensestypeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Description: 根据费用项目内码获得费用项目的编号和名称
     * @Param: [billtype]
     * @Return: java.lang.String
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2019/12/9 17:59
     */
    public List<Object[]> getFyxmBhNameBynm(String id){
        try {
            javax.persistence.Query query = entityManager.createNativeQuery("select o.code,o.name_chs from BFEXPENSESTYPE o where o.id=?1");
            query.setParameter(1,id);
            List<Object[]> FyxmBhNameList = query.getResultList();
            return FyxmBhNameList;
        } catch (Exception sqlex) {
            sqlex.printStackTrace();
            throw new RuntimeException(sqlex);
        }
    }

    /**
     * Description: 根据业务来源，单据类型，获得限制费用项目的内码
     * @Param: [ywly, lxnm]
     * @Return: java.util.List<java.lang.String>
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2019/12/9 18:59
     */
    public List<Object> getFynmListByLxnm(String lxnm){
        try {
            javax.persistence.Query query = entityManager.createNativeQuery("select roxzfy_fynm from roxzfy where roxzfy_lxnm = ?1");
            query.setParameter(1,lxnm);
            List<Object> fynmList = query.getResultList();
            return fynmList;
        } catch (Exception sqlex) {
            sqlex.printStackTrace();
            throw new RuntimeException(sqlex);
        }
    }

    /**
     * Description: 根据单位内码获得费用项目内码列表
     * @Param: [orgId]
     * @Return: java.util.List<java.lang.String>
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2019/12/9 19:16
     */
    public List<Object> getFynmListByOrgId(String orgId){
        try {
            javax.persistence.Query query = entityManager.createNativeQuery("SELECT typeid  from BFEXPENSESTYPEORGLINKS  where unitid = ?1");
            query.setParameter(1,orgId);
            List<Object> fynmList = query.getResultList();
            return fynmList;
        } catch (Exception sqlex) {
            sqlex.printStackTrace();
            throw new RuntimeException(sqlex);
        }
    }

    /**
     * Description: 根据单据类型和单位费用项目过滤的费用项目内码数组 获得总的费用项目
     * @Param: [fynmList, orgfynmList]
     * @Return: java.util.List<java.lang.String>
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2019/12/9 19:23
     */
    public List<Object> getFyxmnmListBy2List(List<String> fynmList,List<String> orgfynmList){
        try {
            javax.persistence.Query query = entityManager.createNativeQuery("select id from bfexpensestype where state_isenabled = '1'  and (domaintype = '0' or ((domaintype='1' or domaintype='2' ) and id in(?1))) and id in(?2)");
            query.setParameter(1,orgfynmList);
            query.setParameter(2,fynmList);
            List<Object> fyxmnmList = query.getResultList();
            return fyxmnmList;
        } catch (Exception sqlex) {
            sqlex.printStackTrace();
            throw new RuntimeException(sqlex);
        }
    }

    /**
     * Description: 通过组织id获得限制费用项目内码列表
     * @Param: [orgId]
     * @Return: java.util.List<java.lang.Object>
     * @Author: 姜少帅 (jiangshsh)
     * @Date: 2020/3/23 16:36
     */
    public List<Object> getFyxmListByOrg(String orgId){
        try {
            javax.persistence.Query query = entityManager.createNativeQuery("select id from bfexpensestype where domaintype = '0' or ((domaintype='1' or domaintype='2' )and id in(SELECT typeid  from bfexpensestypeorglinks  where unitid = ?1))");
            query.setParameter(1,orgId);
            List<Object> fyxmnmList = query.getResultList();
            return fyxmnmList;
        } catch (Exception sqlex) {
            sqlex.printStackTrace();
            throw new RuntimeException(sqlex);
        }
    }



}
