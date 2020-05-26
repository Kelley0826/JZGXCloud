package com.inspur.gs.fssp.pubjz.foundation.tb.repository;

import com.inspur.gs.fssp.pubjz.foundation.tb.entity.JZTBDJCZDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author jiangshaoshuai
 * @since 2019/11/29 18:41
 * 预算接口调用
 */
@Repository
public interface JZTBRepository extends JpaRepository<JZTBDJCZDO, String>, JpaSpecificationExecutor<JZTBDJCZDO>, Serializable {

}

