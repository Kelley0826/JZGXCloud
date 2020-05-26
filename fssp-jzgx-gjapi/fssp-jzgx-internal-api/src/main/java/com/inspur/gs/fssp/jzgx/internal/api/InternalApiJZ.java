package com.inspur.gs.fssp.jzgx.internal.api;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/fssc")
@Produces(MediaType.APPLICATION_JSON)
public interface InternalApiJZ {
    /**
     * 保存FSBZDJ（新的，使用RPC）
     */
    @POST
    @Path("/fssave")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet saveFSBZDJ(Map<String, Object> data);

    /**
     * 保存（旧的，使用构件）
     */
    @POST
    @Path("/fssave")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet saveFSBZDJ(@QueryParam("gnid") String gnid, String billInfo);
    /**
     * 删除
     */
    @POST
    @Path("/delete")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet delete(Map<String,Object> data);


    /**
     * 更新流程其他信息
     */
    @POST
    @Path("/updatepfrutasks")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet updatePfrutasks(Map<String,Object> data);

    /**
     * 提交流程
     */
    @POST
    @Path("/submitapprove")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet submitApprove(Map<String, Object> billInfo);

    /**
     * 撤回流程
     */
    @POST
    @Path("/retractapprove")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet retractApprove(Map<String, Object> billInfo);


    /**
     * 通过前
     */
    @POST
    @Path("/approvepassbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet approvePassBefore(Map<String, Object> billInfo);

    /**
     * 通过
     */
    @POST
    @Path("/approvepass")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet approvePass(Map<String, Object> billInfo);


    /**
     * 退回前
     */
    @POST
    @Path("/approvebackbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet approveBackBefore(Map<String, Object> billInfo);

    /**
     * 退回
     */
    @POST
    @Path("/approveback")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet approveBack(Map<String, Object> billInfo);


    /**
     * 报账类型定义保存
     * */
    @POST
    @Path("/savebzlx")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet saveBZLX(HashMap<String, Object> savaData);

    /**
     * 删除类型定义
     * */
    @POST
    @Path("/deletebzlx")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet deleteBZLX(HashMap<String, Object> deleteData);






}
