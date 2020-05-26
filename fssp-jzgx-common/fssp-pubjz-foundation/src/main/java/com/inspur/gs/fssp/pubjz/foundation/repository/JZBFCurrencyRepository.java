package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZBFCurrencyDO;
import io.iec.caf.data.jpa.repository.CafJpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description: 币种Mapper（数据库操作）
 * Author: sakura sun (sunchao)
 * Date:  2019/8/28 9:20
 * Company: Inspur
 */
@Repository
public interface JZBFCurrencyRepository extends CafJpaRepository<JZBFCurrencyDO,String> {

    /**
     * Description: 根据ID获取币种全部信息
     * @Param: [currencyID]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.BFCurrencyDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/8/28 9:23
     */
    @Query(value = "select o from JZBFCurrencyDO o where o.id = ?1 ")
    JZBFCurrencyDO getCurrencyAllInfoById(String currencyId);

    /**
     * Description: 根据编号获取币种信息
     * @Param: [currencyCode]
     * @Return: java.util.List<com.inspur.gs.fssp.common.foundation.entity.BFCurrencyDO>
     * @Author: sakura sun (sunchao)
     * @Date: 2020/3/7 15:09
     */
    @Query(value = "select o from JZBFCurrencyDO o where o.code = ?1 ")
    List<JZBFCurrencyDO> getCurrencyAllInfoByCode(String currencyCode);

}
