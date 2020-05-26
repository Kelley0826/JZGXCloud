package com.inspur.gs.fssp.jzgx.external.api.voucher;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import io.iec.edp.caf.rpc.api.annotation.GspParamSerializeType;
import io.iec.edp.caf.rpc.api.annotation.GspServiceBundle;
import io.iec.edp.caf.rpc.api.common.GspSerializeType;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/jzgxvoucherwriteback")
@Produces(MediaType.APPLICATION_JSON)
@GspServiceBundle(applicationName = "fssp",serviceUnitName = "jzgx",serviceName = "jzgx_vourcherwriteback")
public interface ExternalApiOnVoucherJZ {
    /**
     * 凭证回写对外提供接口
     * @param aipReturnData
     * @return  {"AccDocID":"凭证id","Year":"年度","AccOrgID":"","Ledger":"","DataSourceID":"业务数据源",、
     *      *              "BusinessType":"业务类型","BusinessIDs":"逗号隔开","AccDocProcessType":"Save(保存)，Delete(删除)，
     *      *              Virtual（虚拟生成），Addition（附加生成），Cancel（作废），Red（红冲）",AccDocCode："凭证编号"}
     *
    //@ResponseBody  @RequestBody
     */
    @POST
    @Path("/voucherwriteback")
    @GspParamSerializeType(paramName = "aipReturnData",paramSerializeType = GspSerializeType.Json)
    ResultRet roVoucherWriteBack(String aipReturnData);
}
