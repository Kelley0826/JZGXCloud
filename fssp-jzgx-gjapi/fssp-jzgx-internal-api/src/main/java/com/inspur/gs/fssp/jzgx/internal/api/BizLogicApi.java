package com.inspur.gs.fssp.jzgx.internal.api;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Map;

/**
 * @Description:
 * @author: db
 * @date: 2020/5/13 14:44
 */
@Path("/bizlogic")
@Produces(MediaType.APPLICATION_JSON)
public interface BizLogicApi {

    /**
      * 新增用户信息后获取单据信息
      */
    @POST
    @Path("/getbillinfoonadd")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet getBillInfoOnAdd(Map<String,Object> inputInfo);

    /**
      * 切换报账人后获取行政人员信息
      */
    @POST
    @Path("/getuserinfonadd")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet getUserInfoOnAdd(Map<String,Object> inputInfo);


    /**
      * 获取汇率
      */
    @POST
    @Path("/getbfexchangeRateValue")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet getbfexchangeRateValue(Map<String,Object> object);

    /**
      * 获取列表状态
      */

    @POST
    @Path("/getliststatus")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet getListStatus(Map<String,Object> object);





}
