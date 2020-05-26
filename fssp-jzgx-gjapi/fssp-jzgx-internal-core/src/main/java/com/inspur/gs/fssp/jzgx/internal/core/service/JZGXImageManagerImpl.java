package com.inspur.gs.fssp.jzgx.internal.core.service;

import com.inspur.gs.fssp.pubjz.common.entity.JZFSSPLangEnum;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPLangService;
import com.inspur.gs.fssp.pubjz.foundation.entity.JZFSSPImageResult;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.pubjz.foundation.utils.JZFSSPComponentInvoke;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPJSONSerializer;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPLoggerFactory;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPRpcClient;
import com.inspur.gs.fssp.jzgx.internal.api.JZGXImageManagerAPI;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedHashMap;
import java.util.Map;

public class JZGXImageManagerImpl implements JZGXImageManagerAPI {

//    @Autowired
//    private FSSPCMPInvoke fsspCmpInvoke;

    @Autowired
    private JZFSSPComponentInvoke JZFSSPComponentInvoke;
    @Autowired
    JZFSSPRpcClient JZFSSPRpcClient;

    @Autowired
    JZFSSPLangService JZFSSPLangService;

    private static final JZFSSPLoggerFactory logger = JZFSSPLoggerFactory.getLogger(InternalImplJZ.class);


    /**
     * 发起影像任务
     *
     * @param map 自定义参数，其中barcode为必传
     * @return ResultRet
     */
    @Override
    public ResultRet startWorkFlow(Map<String, String> map) {
        String mapStr = JZFSSPJSONSerializer.serialize(map);
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(false);
        resultInfo.setMessage("暂不支持此影像接口");
        //ResultRet resultInfo = fsspCmpInvoke.postResultJson("fsimagei-856f-4f08-bf28-ed8b409d1027", mapStr);

        return resultInfo;
    }

    /**
     * 查看影像信息
     *
     * @param map 自定义参数，其中barcode为必传
     * @return ResultRet
     */
    @Override
    public ResultRet getImageInfo(Map<String, String> map) {
        String mapStr = JZFSSPJSONSerializer.serialize(map);
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(false);
        resultInfo.setMessage("暂不支持此影像接口");
        //ResultRet resultInfo = fsspCmpInvoke.postResultJson("fsimagei-856f-4f08-bf28-ed8b409d1020", mapStr);

        return resultInfo;
    }

    /**
     * 影像归档
     *
     * @param map 自定义参数，其中barcode为必传
     * @return ResultRet
     */
    @Override
    public ResultRet lockedBillCode(Map<String, String> map) {
        String mapStr = JZFSSPJSONSerializer.serialize(map);
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(false);
        resultInfo.setMessage("暂不支持此影像接口");
        //ResultRet resultInfo = fsspCmpInvoke.postResultJson("fsimagei-856f-4f08-bf28-ed8b409d1008", mapStr);

        return resultInfo;
    }

    /**
     * 发起影像补扫
     *
     * @param map 自定义参数，其中barcode为必传
     * @return ResultRet
     */
    @Override
    public ResultRet startImagePlusFlow(Map<String, String> map) {
        String mapStr = JZFSSPJSONSerializer.serialize(map);
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(false);
        resultInfo.setMessage("暂不支持此影像接口");
        //ResultRet resultInfo = fsspCmpInvoke.postResultJson("fsimagei-856f-4f08-bf28-ed8b409d2111", mapStr);

        return resultInfo;
    }

    /**
     * 附件式获取影像
     *
     * @param map map中必传参数列表如下
     *            SourceSys ：来源系统，
     * @return
     */
    @Override
    public ResultRet getImageURL(Map<String, String> map) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(false);
        resultRet.setCode(0);
        logger.info("调用影像入参：" + map);
        if (!map.containsKey("SourceSys")) {

            map.put("SourceSys", "FSRO");
        } else {
            if (StringUtils.isEmpty(map.get("SourceSys"))) {
                map.put("SourceSys", "FSRO");
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rpcUrlMapParam", map);

//        String mapStr = FSSPJSONSerializer.serialize(map);
//        ResultRet resultInfo = fsspCmpInvoke.postResultJson("fsimagei-856f-4f08-bf28-ed8b409d1214", mapStr);

        JZFSSPImageResult resultImage = JZFSSPRpcClient.invoke(JZFSSPImageResult.class, "com.inspur.gs.eis.image.restful.eis.ImageAPIEisRest.getyxurlmap", "EIS", linkedHashMap, null);


        if(resultImage==null){
            resultRet.setMessage(JZFSSPLangService.getLanguageString(JZFSSPLangEnum.FSPubBack,"FSPubBack0034" ));
            return resultRet;
        }

        if ("ok".equals(resultImage.getCode())) {

            ResultRet resultRetIn=new ResultRet();
            resultRetIn.setResult(true);
            resultRetIn.setValue( resultImage);
            resultRetIn.setMessage(resultImage.getMes());

            resultRet.setValue(JZFSSPJSONSerializer.serialize(resultRetIn));
        }
        else{
            ResultRet resultRetIn=new ResultRet();
            resultRetIn.setResult(false);
            resultRetIn.setValue(resultImage);
            resultRetIn.setMessage(resultImage.getMes());
            resultRet.setValue(JZFSSPJSONSerializer.serialize(resultRetIn));
        }

        resultRet.setResult(true);
        logger.info("调用影像返回结果：" + resultRet);
        return resultRet;
    }

}
