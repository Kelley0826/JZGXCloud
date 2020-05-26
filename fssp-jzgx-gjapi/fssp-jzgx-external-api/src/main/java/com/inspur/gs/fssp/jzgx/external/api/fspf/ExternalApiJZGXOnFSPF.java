package com.inspur.gs.fssp.jzgx.external.api.fspf;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import io.iec.edp.caf.rpc.api.annotation.GspParamSerializeType;
import io.iec.edp.caf.rpc.api.annotation.GspServiceBundle;
import io.iec.edp.caf.rpc.api.common.GspSerializeType;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Description:  外部接口   提供给 流程框架
 * Author: inspur
 * Date:  2020/04/27
 * Company: Inspur
 */
@Path("/fsjzgx/pf")
@Produces(MediaType.APPLICATION_JSON)
@GspServiceBundle(applicationName = "fssp",serviceUnitName = "jzgx",serviceName = "fssp_externalapijzgxonfspf")
public interface ExternalApiJZGXOnFSPF {

    /**
     * 触发节点事件前
     */
    @POST
    @Path("/tirggernodebefore")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params" ,paramSerializeType = GspSerializeType.Json)
    ResultRet tirggerNodeBefore(Map<String,Object> data);

    /**
     * 触发节点事件
     */
    @POST
    @Path("/tirggernode")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params" ,paramSerializeType = GspSerializeType.Json)
    ResultRet tirggerNode(Map<String,Object> data);

    /**
     * 提交前
     */
    @POST
    @Path("/submitapprovebefore")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params" ,paramSerializeType = GspSerializeType.Json)
    ResultRet submitApproveBefore(Map<String,Object> data);

    /**
     * 提交
     */
    @POST
    @Path("/submitapprove")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params" ,paramSerializeType = GspSerializeType.Json)
    ResultRet submitApprove(Map<String,Object> data);
    /**
     * 通过前检查
     */
    @POST
    @Path("/approvepassbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params" ,paramSerializeType = GspSerializeType.Json)
    ResultRet approvePassBefore(Map<String,Object> data);

    /**
     * 通过
     */
    @POST
    @Path("/approvepass")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params" ,paramSerializeType = GspSerializeType.Json)
    ResultRet approvePass(Map<String,Object> data);

    /**
     * 退回前检查
     */
    @POST
    @Path("/approvebackbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params" ,paramSerializeType = GspSerializeType.Json)
    ResultRet approveBackBefore(Map<String,Object> data);

    /**
     * 退回
     */
    @POST
    @Path("/approveback")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params" ,paramSerializeType = GspSerializeType.Json)
    ResultRet approveBack(Map<String,Object> data);

    /**
     * 撤回前检查
     */
    @POST
    @Path("/retractbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params" ,paramSerializeType = GspSerializeType.Json)
    ResultRet retractBefore(Map<String,Object> data);

    /**
     * 撤回
     */
    @POST
    @Path("/retract")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params" ,paramSerializeType = GspSerializeType.Json)
    ResultRet retract(Map<String,Object> data);

    /**
     * 更新单据状态
     */
    @POST
    @Path("/updatestate")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params" ,paramSerializeType = GspSerializeType.Json)
    ResultRet updateState(Map<String,Object> data);

    /**
     * 联查单据
     */
    @POST
    @Path("/billview")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params" ,paramSerializeType = GspSerializeType.Json)
    ResultRet billView(Map<String,Object> data);
    /**
     * 单据完成处理
     */
    @POST
    @Path("/complete")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params" ,paramSerializeType = GspSerializeType.Json)
    ResultRet wflowfinish(Map<String,Object> data);




}
