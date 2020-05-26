package com.inspur.gs.fssp.jzgx.data.repository.pub;

import com.inspur.gs.fssp.jzgx.data.entity.pub.FsbzdjEntity;
import io.iec.edp.caf.data.orm.DataRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * @Description:
 * @author: db
 * @date: 2020/5/20 18:05
 */
@Repository
public interface FsbzdjRepository extends DataRepository<FsbzdjEntity,String> {

    /**
     * 依据单据内码获取主表实体信息
     */
    @Query(value = "select o from FsbzdjEntity o where o.fsbzdjDjnm=?1 ")
    FsbzdjEntity getAllInfoByNM(String djnm);

    /**依据单据内码获取单据编号 */
    @Query(value = "select fsbzdj_djbh from fsbzdj where fsbzdj_djnm=?1 ",nativeQuery = true)
    String getDjbhByDjnm(String djnm);

    /**依据单据内码获取单据状态*/
    @Query(value = "select fsbzdj_djzt from fsbzdj where fsbzdj_djnm=?1 ",nativeQuery = true)
    String getDjztByDjnm(String djnm);

    /**依据单据内码获取单据状态说明*/
    @Query(value = "select fsbzdj_ztsm from fsbzdj where fsbzdj_djnm=?1 ",nativeQuery = true)
    String getDjztsmByDjnm(String djnm);
}
