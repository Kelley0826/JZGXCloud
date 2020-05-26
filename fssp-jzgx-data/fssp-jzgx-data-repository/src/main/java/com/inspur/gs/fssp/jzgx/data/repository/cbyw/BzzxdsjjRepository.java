package com.inspur.gs.fssp.jzgx.data.repository.cbyw;

import com.inspur.gs.fssp.jzgx.data.entity.cbyw.BzzxdsjjEntity;
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
 * @date: 2020/5/2
 */
@Repository
public interface BzzxdsjjRepository extends DataRepository<BzzxdsjjEntity,String>  {

    /**依据单据内码获取主表实体信息 */
    @Query(value = "select o from BzzxdsjjEntity o where o.dsjjDjnm=?1 " )
    BzzxdsjjEntity getAllInfoByNM(String nm);

    /**依据单据内码获取单据编号 */
    @Query(value = "select dsjj_djbh from bzzxdsjj where dsjj_djnm=?1 ",nativeQuery = true)
    String getDjbhByNm(String nm);


    /**
      * @Author: inspur
      * @Description: 更新单据状态
      * @Date: 2020/5/2
      * @Return: [nm, state, ztsm]
      */
    @org.springframework.transaction.annotation.Transactional
    @Modifying
    @Query(value = " UPDATE bzzxdsjj  SET  dsjj_bzzt =?2 ,dsjj_djzt = ?3 where  dsjj_djnm =?1", nativeQuery = true)
    int updateDsjjZT(String nm,Integer state,String ztsm);
    /**
      * @Author: inspur
      * @Description: 更新退回原因
      * @Date: 2020/5/2

      * @Return: [nm, backReason]
      */
    @org.springframework.transaction.annotation.Transactional
    @Modifying
    @Query(value = " UPDATE bzzxdsjj  SET  dsjj_zy=?2  where  dsjj_djnm =?1", nativeQuery = true)
    int updateBackReason(String nm,String backReason);
    /**
      * @Author: inspur
      * @Description: 更新流程实例
      * @Date: 2020/5/2

      * @Return: [nm, lcsl]
      */
    @Transactional
    @Modifying
    @Query(value = " UPDATE bzzxdsjj  SET  dsjj_wfid=?2  where  dsjj_djnm =?1", nativeQuery = true)
    int updateLCSL(String nm,String lcsl);

    /**
      * @Author: inspur
      * @Description: 获取行政人员id
      * @Date: 2020/5/2

      * @Return: [ygnm, ygnmStr, zzid]
      */
    @Query(value = "select id from bfemployee where id = :strnm or id in (:wtrid) or organization in (:wtbmid)", nativeQuery = true)
    Object[] getYGNMList(@Param("strnm") String strnm, @Param("wtrid") List<String> wtrid, @Param("wtbmid") List<String> wtbmid);


}
