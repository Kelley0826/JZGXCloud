package com.inspur.gs.fssp.pubjz.foundation.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author: sun mingzhi
 * Date:  2019/10/16 11:37
 * Company: Inspur
 */
@Repository
public class JZFILedgerAccSystemRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public  String  getFILedgerAccSystemMaincurrencyByAccOrg(String accorg)
    {
        Query query = entityManager.createNativeQuery("SELECT o.maincurrency FROM FILedgerAccSystem  o WHERE o.accorg=?1 ");
        query.setParameter(1,accorg);
        List<String> userInfo=query.getResultList();
        if(userInfo.size()>0)
        {
            return userInfo.get(0);
        }
        return null;
    }
}
