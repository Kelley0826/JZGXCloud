package com.inspur.gs.fssp.jzgx.internal.api;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Path("/imagemanager")
@Produces(MediaType.APPLICATION_JSON)
public interface JZGXImageManagerAPI {

    /**
     * 发起影像任务
     */
    @POST
    @Path("/startworkflow")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet startWorkFlow(@RequestBody Map<String, String> map);
    /**
     * 查看电子影像，业务对接后可以根据业务传递参数
     */
    @POST
    @Path("/getimageinfo")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet getImageInfo(@RequestBody Map<String, String> map);
    /**
     * 影像归档
     */
    @POST
    @Path("/lockedbillcode")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet lockedBillCode(@RequestBody Map<String, String> map);
    /**
     * 发起影像补扫
     */
    @POST
    @Path("/startimageplusflow")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet startImagePlusFlow(@RequestBody Map<String, String> map);

    /**
     * 附件式影像
     */
    @POST
    @Path("/getimageurl")
    @Consumes(MediaType.APPLICATION_JSON)
    ResultRet getImageURL(@RequestBody Map<String, String> map);

}
