package com.inspur.gs.fssp.pubjz.foundation.repository;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZGSPUserDO;
import io.iec.edp.caf.data.orm.DataRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA
 * Description: 系统用户Mapper（数据库操作类）
 * Author: sakura sun (sunchao)
 * Date:  2019/8/28 8:45
 * Company: Inspur
 */
@Repository
public interface JZGSPUserRepository extends DataRepository<JZGSPUserDO,String>{

    /**
     * Description: 获取系统用户信息
     * @Param: [userId]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.GSPUserDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/8/28 8:52
     */
    @Query(value = "select o.id,o.code,o.name_chs from JZGSPUserDO o where o.id = ?1 ")
    JZGSPUserDO getUserInfo(String userId);

    /**
     * Description: 获取系统用户全部信息
     * @Param: [userID]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.GSPUserDO
     * @Author: sakura sun (sunchao)
     * @Date: 2019/8/28 8:54
     */
    @Query(value = "select o from JZGSPUserDO o where o.id = ?1 ")
    JZGSPUserDO getUserAllInfo(String userID);
}
