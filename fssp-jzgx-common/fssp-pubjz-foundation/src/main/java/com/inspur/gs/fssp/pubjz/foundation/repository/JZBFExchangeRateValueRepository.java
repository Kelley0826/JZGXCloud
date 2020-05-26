package com.inspur.gs.fssp.pubjz.foundation.repository;


import com.inspur.gs.fssp.pubjz.foundation.entity.JZBFExchangeRateValueDo;
import io.iec.edp.caf.data.orm.DataRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA
 * Description:汇率Mapper
 * Author: sun mingzhi
 * Date:  2019/9/30 15:31
 * Company: Inspur
 */


@Repository
public interface JZBFExchangeRateValueRepository extends DataRepository<JZBFExchangeRateValueDo,String> {

    @Query(value = "select  o from JZBFExchangeRateValueDo o where  o.parentid = ?1")
    JZBFExchangeRateValueDo getExchangeRateValueAllInfoById(String exchangerateratevalueId);

}

