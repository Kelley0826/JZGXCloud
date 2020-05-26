package com.inspur.gs.fssp.pubjz.foundation.api;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

/**
 * @Author tangchm01
 * @Date 2020/2/11 9:59
 * @Version 1.0
 */
@Path("/getbillbe")
@Produces(MediaType.APPLICATION_JSON)
public interface JZBillBeApi {

    /**
     *
     * @param params  Formclasscode 表单分类   Formywclasscode 表单业务分类
     *                First  第一维度    Second 第二维度
     * @return
     */
    @POST
    @Path("/getbeidbybillclassandbillywclass")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet getBeByBillclassAndBillywclass(Map<String, Object> params);

}
