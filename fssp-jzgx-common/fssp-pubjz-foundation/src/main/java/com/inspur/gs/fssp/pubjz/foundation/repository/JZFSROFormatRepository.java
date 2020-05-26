package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZFSROFORMATDO;
import io.iec.caf.data.jpa.repository.CafJpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author tangchm01
 * @Date 2020/3/17 10:14
 * @Version 1.0
 */
@Repository
public interface JZFSROFormatRepository extends CafJpaRepository<JZFSROFORMATDO, String> {
}
