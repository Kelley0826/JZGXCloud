package com.inspur.gs.fssp.pubjz.foundation.api;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

/**
 * 前台获取多语言的路径
 * @Data 2020-2-26 14:07:44
 */
@Path("/getlangservice")
@Produces(MediaType.APPLICATION_JSON)
public interface JZFSSPLangServiceApi {
    @POST
    @Path("/getlangmessage")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet getLangMessage(Map<String, Object> params);
}
