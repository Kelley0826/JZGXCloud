package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZFSROFormClassWDDO;
import io.iec.caf.data.jpa.repository.CafJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author tangchm01
 * @Date 2020/2/12 11:59
 * @Version 1.0
 */
@Repository
public interface JZFSROFormClassWDRepository extends CafJpaRepository<JZFSROFormClassWDDO, String> {
   List<JZFSROFormClassWDDO> findAllByFormclassid(String formclassid);
}
