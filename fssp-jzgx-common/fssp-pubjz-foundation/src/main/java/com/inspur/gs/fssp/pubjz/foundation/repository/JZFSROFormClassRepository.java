package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZFSROFormClassDO;
import io.iec.caf.data.jpa.repository.CafJpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author tangchm01
 * @Date 2020/2/12 19:42
 * @Version 1.0
 */
@Repository
public interface JZFSROFormClassRepository extends CafJpaRepository<JZFSROFormClassDO, String> {
}
