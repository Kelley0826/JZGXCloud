package com.inspur.gs.fssp.jzgx.external.api.fssp;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import io.iec.edp.caf.rpc.api.annotation.GspParamSerializeType;
import io.iec.edp.caf.rpc.api.annotation.GspServiceBundle;
import io.iec.edp.caf.rpc.api.common.GspSerializeType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Description:  外部接口  建筑共享 提供给 共享框架
 * Author: inspur
 * Date:  2020/04/27
 * Company: Inspur
 */
@Path("/fsjzgx/sp")
@Produces(MediaType.APPLICATION_JSON)
@GspServiceBundle(applicationName = "fssp",serviceUnitName = "jzgx",serviceName = "fssp_externalapijzgxonfssp")
public interface ExternalApiJZGXOnFSSP {
    /**
     * 获取url
     */
    /*
    @POST
    @Path("/geturl")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params",paramSerializeType = GspSerializeType.Json)
    ResultRet getUrl(HashMap<String,Object> info);
*/
    /**
     * 提交
     */
    @POST
    @Path("/submit")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params",paramSerializeType = GspSerializeType.Json)
    ResultRet submit(Map<String,Object> data);

    /**
     * 提交前
     */
    @POST
    @Path("/submitbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params",paramSerializeType = GspSerializeType.Json)
    ResultRet submitBefore(Map<String,Object> data);

    /**
     * 撤回
     */
    @POST
    @Path("/retract")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params",paramSerializeType = GspSerializeType.Json)
    ResultRet retract(Map<String,Object> data);
    /**
     * 撤回前
     */
    @POST
    @Path("/retractbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params",paramSerializeType = GspSerializeType.Json)
    ResultRet retractbefore(Map<String,Object> data);

    /**
     * 删除
     */
    @POST
    @Path("/delete")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params",paramSerializeType = GspSerializeType.Json)
    ResultRet deleteBill(Map<String,Object> data);
    /**
     * 删除前
     */
    @POST
    @Path("/deletebefore")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params",paramSerializeType = GspSerializeType.Json)
    ResultRet deletebefore(Map<String,Object> data);

    /**
     * 联查
     */
    @POST
    @Path("/billview")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params",paramSerializeType = GspSerializeType.Json)
    ResultRet billView(Map<String, Object> data);


}
