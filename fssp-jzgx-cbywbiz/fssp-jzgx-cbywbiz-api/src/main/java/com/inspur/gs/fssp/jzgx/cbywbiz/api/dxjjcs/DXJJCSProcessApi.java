package com.inspur.gs.fssp.jzgx.cbywbiz.api.dxjjcs;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

/**
 * @Description: 流程处理接口：初审、稽核、复核、完成
 * @author: db
 * @date: 2020/5/12 16:57
 */
@Path("/fsproc")
@Produces(MediaType.APPLICATION_JSON)
public interface DXJJCSProcessApi {
    /**
      * 初审  触发节点前事件
      */
    @POST
    @Path("/tirggernodebeforecs")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet tirggerNodeBeforeCS(Map<String,Object> object);

    /**
      * 初审  触发节点事件
      */
    @POST
    @Path("/tirggernodecs")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet tirggerNodeCS(Map<String,Object> object);

    /**
     * 初审   通过前
     */
    @POST
    @Path("/firstauditpassbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet firstAuditPassBefore(Map<String, Object> billInfo) ;

    /**
     * 初审   通过
     */
    @POST
    @Path("/firstauditpass")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet firstAuditPass(Map<String, Object> billInfo);

    /**
     * 初审   通过后
     */
    @POST
    @Path("/firstauditpassafter ")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet firstAuditPassAfter(Map<String, Object> billInfo);

    /**
     * 初审   退回前
     */
    @POST
    @Path("/firstauditbackbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet firstAuditBackBefore(Map<String, Object> billInfo);

    /**
     * 初审   退回
     */
    @POST
    @Path("/firstauditback")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet firstAuditBack(Map<String, Object> billInfo);

    /**
     * 初审   退回后
     */
    @POST
    @Path("/firstauditbackafter")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet firstAuditBackAfter(Map<String, Object> billInfo);

    /**
     * 初审   撤回审批前检查
     */
    @POST
    @Path("/firstauditchbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet firstAuditCHBefore(Map<String, Object> billInfo);

    /**
     * 初审   撤回审批
     */
    @POST
    @Path("/firstauditch")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet firstAuditCH(Map<String, Object> billInfo);


    /**
     * 初审   撤回审批后
     */
    @POST
    @Path("/firstauditchafter")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet firstAuditCHAfter(Map<String, Object> billInfo);




    /**
      * 稽核   触发节点前事件
      */
    @POST
    @Path("/tirggernodebeforejh")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet tirggerNodeBeforeJH(Map<String,Object> object);

    /**
      * 稽核   触发节点事件
      */
    @POST
    @Path("/tirggernodejh")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet tirggerNodeJH(Map<String,Object> object);

    /**
     * 稽核   通过前
     */
    @POST
    @Path("/auditpassbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet auditPassBefore(Map<String, Object> billInfo);

    /**
     * 稽核   通过
     */
    @POST
    @Path("/auditpass")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet auditPass(Map<String, Object> billInfo);

    /**
     * 稽核   通过后
     */
    @POST
    @Path("/auditpassafter")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet auditPassAfter(Map<String, Object> billInfo);

    /**
     * 稽核   退回前
     */
    @POST
    @Path("/auditbackbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet auditBackBefore(Map<String, Object> billInfo);

    /**
     * 稽核   退回
     */
    @POST
    @Path("/auditback")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet auditBack(Map<String, Object> billInfo);

    /**
     * 稽核   退回后
     */
    @POST
    @Path("/auditbackafter")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet auditBackAfter(Map<String, Object> billInfo);

    /**
     *稽核   取消稽核前检查
     */
    @POST
    @Path("/auditchbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet auditCHBefore(Map<String, Object> billInfo);

    /**
     * 稽核   取消稽核
     */
    @POST
    @Path("/auditch")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet auditCH(Map<String, Object> billInfo);

    /**
     * 稽核   取消稽核后
     */
    @POST
    @Path("/auditchafter")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet auditCHAfter(Map<String, Object> billInfo);


    /**
      * 复核   触发节点前事件
      */
    @POST
    @Path("/tirggernodebeforefh")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet tirggerNodeBeforeFH(Map<String,Object> object);

    /**
      * 复核   触发节点事件
      */
    @POST
    @Path("/tirggernodefh")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet tirggerNodeFH(Map<String,Object> object);


    /**
     * 复核   通过前
     */
    @POST
    @Path("/recheckpassbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet recheckPassBefore(Map<String, Object> billInfo);

    /**
     * 复核   通过
     */
    @POST
    @Path("/recheckpass")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet recheckPass(Map<String, Object> billInfo);

    /**
     * 复核   通过后
     */
    @POST
    @Path("/recheckpassafter")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet recheckPassAfter(Map<String, Object> billInfo);

    /**
     * 复核   退回前
     */
    @POST
    @Path("/recheckbackbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet recheckBackBefore(Map<String, Object> billInfo);

    /**
     * 复核   退回
     */
    @POST
    @Path("/recheckback")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet recheckBack(Map<String, Object> billInfo);

    /**
     * 复核   退回后
     */
    @POST
    @Path("/recheckbackafter")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet recheckBackAfter(Map<String, Object> billInfo);


    /**
     * 完成
     */
    @POST
    @Path("/accomplish")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet accomplish(Map<String,Object> data);



}
