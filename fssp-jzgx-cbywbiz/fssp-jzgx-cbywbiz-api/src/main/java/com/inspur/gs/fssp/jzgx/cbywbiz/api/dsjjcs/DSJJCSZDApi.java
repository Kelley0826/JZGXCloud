package com.inspur.gs.fssp.jzgx.cbywbiz.api.dsjjcs;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.pubjz.common.entity.JZFSSaveDataVO;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Map;

/**
 * @Description:  制单时处理接口
 * @author: db
 * @date: 2020/5/12 17:30
 */

@Path("/fszd")
@Produces(MediaType.APPLICATION_JSON)

public interface DSJJCSZDApi {

    /**
     *  保存
     */
    @POST
    @Path("/savebill")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet saveBill(JZFSSaveDataVO dataInfo);
    /**
     * 编辑
     */
    @POST
    @Path("/checkedit")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet checkEdit(Map<String,Object> object);

    /**
     * 保存单据后的逻辑处理事件
     */
    @POST
    @Path("/savebillAfter")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet savebillAfter(Map<String,Object> object);



    /**
     * 提交前
     */
    @POST
    @Path("/submitbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet submitBefore(Map<String,Object> data);

    /**
     * 提交
     */
    @POST
    @Path("/submit")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet submit(Map<String,Object> data);

    /**
     * 提交后
     */
    @POST
    @Path("/submitafter")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet submitAfter(Map<String,Object> data);

    /**
     * 撤回前
     */
    @POST
    @Path("/retractbefore")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet retractBefore(Map<String,Object> data);

    /**
     * 撤回
     */
    @POST
    @Path("/retract")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet retract(Map<String,Object> data);

    /**
     * 撤回后
     */
    @POST
    @Path("/retractafter")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet retractAfter(Map<String,Object> data);

    /**
      * 删除前
      */
    @POST
    @Path("/deletebefore")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet deleteBefore(Map<String,Object> data);

    /**
     * 删除
     */
    @POST
    @Path("/deletebill")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet deleteBill(Map<String,Object> data);

    /**
     * 删除后
     */
    @POST
    @Path("/deletebillafter")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet deleteBillAfter(Map<String,Object> data);

    /**
     * 联查影像
     */
    @POST
    @Path("/viewimage")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet viewImage(@QueryParam("nm") String billNM);



}
