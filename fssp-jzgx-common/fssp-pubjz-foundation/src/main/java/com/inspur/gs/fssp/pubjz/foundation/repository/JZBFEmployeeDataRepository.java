package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZBFEmployeeDO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author: sakura sun (sunchao)
 * Date:  2019/9/1 15:09
 * Company: Inspur
 */
@Repository
public class JZBFEmployeeDataRepository {
    @PersistenceContext
    private EntityManager entityManager;

    //@Transactional(rollbackFor = Exception.class)
    public List<JZBFEmployeeDO> getAllHxlx(String userId){
        try {
            Query query = entityManager.createQuery("select o.id,o.code,o.name_chs,o.contactinfo,o.email,o.confidentiallevel,o.idNumber,o.identityType,o.countryOrAera,o.location,o.organization,o.displayName,o.gender,o.state_isenabled,o.sysuser from JZBFEmployeeDO o where o.sysuser = ?1 ");
            query.setParameter(1,userId);
            List<JZBFEmployeeDO> hxlxList = query.getResultList();
            return hxlxList;
        } catch (Exception sqlex) {
            sqlex.printStackTrace();
            throw new RuntimeException(sqlex);
        }
    }
}
