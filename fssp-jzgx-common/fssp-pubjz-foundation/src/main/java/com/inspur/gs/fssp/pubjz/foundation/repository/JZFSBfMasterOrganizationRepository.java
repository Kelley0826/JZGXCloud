package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZFSBfMasterOrganizationDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA
 * Description:  主组织
 * Author: sakura sun (sunchao)
 * Date:  2020/2/27 15:06
 * Company: Inspur
 */
@Repository
public interface JZFSBfMasterOrganizationRepository extends JpaRepository<JZFSBfMasterOrganizationDO,String>, JpaSpecificationExecutor<JZFSBfMasterOrganizationDO>, Serializable {
    /**
     * Description:  获取主组织币种
     * @Param: [id]
     * @Return: java.lang.String
     * @Author: sakura sun (sunchao)
     * @Date: 2020/2/27 15:13
     */
    @Query(value = "select currency from bfmasterorganization where id = ?1" ,nativeQuery = true)
    String getcurrencyid(String id);
}
