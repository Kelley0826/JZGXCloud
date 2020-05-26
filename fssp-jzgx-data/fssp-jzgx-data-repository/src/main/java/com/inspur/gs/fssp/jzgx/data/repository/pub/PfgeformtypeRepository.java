package com.inspur.gs.fssp.jzgx.data.repository.pub;

import com.inspur.gs.fssp.jzgx.data.entity.pub.PfgeformtypeEntity;
import io.iec.edp.caf.data.orm.DataRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @Description:
 * @author: db
 * @date: 2020/5/1 16:21
 */
@Repository
public interface PfgeformtypeRepository  extends DataRepository<PfgeformtypeEntity,String> {

    /**依据单据类型内码获取整体信息 */
    @Query(value = "select o from PfgeformtypeEntity o where o.id=?1 " )
    PfgeformtypeEntity getAllInfoByNM(String nm);

    /**依据单据类型内码获取单据分类 */
    @Query(value = "select bizcatcode from Pfgeformtype where id=?1 ",nativeQuery = true)
    String getDjflByBH(String billtype);

}

