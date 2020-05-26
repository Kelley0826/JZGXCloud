package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZFSROFormTypeSetDO;
import io.iec.caf.data.jpa.repository.CafJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author tangchm01
 * @Date 2020/2/14 13:07
 * @Version 1.0
 */
@Repository
public interface JZFSROFormTypeSetRepository extends CafJpaRepository<JZFSROFormTypeSetDO, String> {
   List<JZFSROFormTypeSetDO> findByFormclassid(String formclassid);
}
