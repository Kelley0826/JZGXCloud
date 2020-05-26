package com.inspur.gs.fssp.pubjz.foundation.repository;


import com.inspur.gs.fssp.pubjz.foundation.entity.JZFSRoformywclassDO;
import io.iec.caf.data.jpa.repository.CafJpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author tangchm01
 * @Date 2020/2/11 9:28
 * @Version 1.0
 */
@Repository
public interface JZFSRoformywclassRepository extends CafJpaRepository<JZFSRoformywclassDO, String> {
    JZFSRoformywclassDO findByFormclasscodeAndFormywclasscode(String formclasscode , String fromywclasscode);
    JZFSRoformywclassDO findByFormywclasscode(String fromywclasscode);
    JZFSRoformywclassDO findByBeid(String beid);
}
