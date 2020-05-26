package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZBFEmployeeDO;
import org.springframework.stereotype.Repository;
//import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author tangchm01
 */
@Repository
public class JZBFEmployeeSysuserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    /**
     * 根据系统用户获取第一个行政人员 未获取到返回null
     * @param gspUserId
     * @return
     */
    public  String  getEmployeeUserIdByGspUserId(String gspUserId)
    {
        Query query = entityManager.createNativeQuery("select  parentid from bfemployeesysuser where sysuser =?1");
        query.setParameter(1,gspUserId);
        List<String> userInfo=query.getResultList();
        if(userInfo.size()>0)
        {
            return userInfo.get(0);
        }
        return null;
    }

    /**
     * 根据系统用户获取所有行政人员ID LIST   未获取返回null
     * @param gspUserId
     * @return
     */
    public  List<String>  getEmployeeUserIdListByGspUserId(String gspUserId)
    {
        Query query = entityManager.createNativeQuery("select  parentid from bfemployeesysuser where sysuser =?1");
        query.setParameter(1,gspUserId);
        List<String> userInfo=query.getResultList();
        if(userInfo.size()>0)
        {
            return userInfo;
        }
        return null;
    }

    /**
     * 根据系统用户获取所有行政人员LIst实体  未获取返回null
     * @param gspUserId
     * @return
     */
    public  List<JZBFEmployeeDO>  getEmployeeListByGspUserId(String gspUserId)
    {
        Query query=entityManager.createQuery("select  o from JZBFEmployeeDO o where o.id in (select t.parentid from JZBFEmployeeSysuserDTO t where t.sysuser=?1)");
        query.setParameter(1,gspUserId);
        List<JZBFEmployeeDO> userInfo=query.getResultList();
        if(userInfo.size()<1)
        {
            return null;
        }
        return userInfo;

    }

    /**
     * 根据系统用户获取所有行政人员实体  未获取返回null
     * @param gspUserId
     * @return
     */
    public JZBFEmployeeDO getEmployeeByGspUserId(String gspUserId)
    {
        Query query=entityManager.createQuery("select  o from JZBFEmployeeDO o where o.id in (select t.parentid from JZBFEmployeeSysuserDTO t where t.sysuser=?1)");
        query.setParameter(1,gspUserId);
        List<JZBFEmployeeDO> userInfo=query.getResultList();
        if(userInfo.size()<1)
        {
            return null;
        }
        return userInfo.get(0);

    }

    /**
     * 根据系统用户获取所有行政人员实体  未获取返回null
     * @param employeeID
     * @return
     */
    public String getEmployeeByParentId(String employeeID)
    {
        Query query = entityManager.createNativeQuery("select  sysuser from bfemployeesysuser o where o.parentid = ?1");
        query.setParameter(1, employeeID);
        List<String> userInfo=query.getResultList();
        if(userInfo.size()>0)
        {
            return userInfo.get(0);
        }
        return null;

    }
}
