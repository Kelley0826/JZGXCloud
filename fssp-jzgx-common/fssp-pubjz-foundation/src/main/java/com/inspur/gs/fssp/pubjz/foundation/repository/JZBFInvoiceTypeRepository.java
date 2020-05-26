package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPLanguageUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Map;

/**
 * @Author tangchm01
 * @Date 2020/1/10 17:25
 * @Version 1.0
 */
@Repository
public class JZBFInvoiceTypeRepository {
    @PersistenceContext
    private EntityManager entityManager;
    public Map<String,Object> getBFInvoiceInfoByCode(String code)
    {
        String originSql="select ID \"ID\",Code \"CODE\",name$language$ \"NAME\" from BFINVOICETYPE where code= ?1";
        String curSql= JZFSSPLanguageUtils.current.replaceLanguage(originSql);
        Query query = entityManager.createNativeQuery(curSql);
        query.setParameter(1,code);
   //     query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List<Map<String,Object>> invoiceInfo = query.getResultList();
        if (invoiceInfo.size() > 0) {
            return invoiceInfo.get(0);
        }
        return null;
    }
}
