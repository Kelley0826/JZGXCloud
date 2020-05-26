package com.inspur.gs.fssp.pubjz.foundation.repository;


import com.inspur.gs.fssp.pubjz.foundation.entity.JZBFExchangeRateDO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:汇率定义Mapper
 * Author: sun mingzhi
 * Date:  2019/9/30 15:30
 * Company: Inspur
 */
@Repository
public class JZBFExchangeRateRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public JZBFExchangeRateDO getExchangeRateIdByorco(String originalcurrency, String convertcurrency)
    {
        //createNativeQuery
        Query query = entityManager.createQuery("SELECT o FROM JZBFExchangeRateDO  o WHERE o.originalCurrency=?1 AND o.ConvertCurrency=?2");
        query.setParameter(1,originalcurrency);
        query.setParameter(2,convertcurrency);
        List<JZBFExchangeRateDO> userInfo=query.getResultList();
        if(userInfo.size()<1)
        {
            return null;
        }
        return userInfo.get(0);
    }



}
