package com.inspur.gs.fssp.jzgx.external.api.fssp;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import io.iec.edp.caf.rpc.api.annotation.GspParamSerializeType;
import io.iec.edp.caf.rpc.api.annotation.GspServiceBundle;
import io.iec.edp.caf.rpc.api.common.GspSerializeType;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;

@Path("/fsbzdj/sp")
@Produces(MediaType.APPLICATION_JSON)
@GspServiceBundle(applicationName = "fssp",serviceUnitName = "jzgx",serviceName = "fssp_externalapibillviewonfssp")
public interface ExternalApiBillViewOnFSSPJZ {

    @POST
    @Path("/geturl")
    @Consumes(MediaType.APPLICATION_JSON)
    @GspParamSerializeType(paramName = "params" ,paramSerializeType = GspSerializeType.Json)
    ResultRet getUrl(HashMap<String,Object> info);
}
