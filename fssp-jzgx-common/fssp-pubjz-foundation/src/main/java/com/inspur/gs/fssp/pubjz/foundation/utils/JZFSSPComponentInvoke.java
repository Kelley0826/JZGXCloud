package com.inspur.gs.fssp.pubjz.foundation.utils;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZFSSPComponentInvokeDO;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPRpcClient;
import io.iec.edp.caf.rpc.api.service.RpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.inspur.gs.fssp.pubjz.common.utils.JZFSSPRpcClient.getErrorMassage;

@Component
public class JZFSSPComponentInvoke {

    /**
     * 注册entityManager  实体管理，共享
     */
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private JZFSSPCMPInvoke JZFSSPCMPInvoke;
    @Autowired
    private RpcClient rpcClient;

    /**
     * 通过构件内码调用参数并返回数据
     *
     * @param ywlyid        业务来源id
     * @param czid          操作id
     * @param czfid         操作方id
     * @param requestString post的传入参数字符串
     * @param url           此url为构件预制后的剩余url自定义组织，比如url中带变量参数等
     * @return
     */
    @Deprecated
    public ResultRet postResultJson(String ywlyid, String czid, String czfid, String requestString, String url) {
        return postResultJson(ywlyid, czid, czfid, requestString, null, url, true);
    }


    /**
     * 通过构件内码调用参数并返回数据
     *
     * @param ywlyid        业务来源id
     * @param czid          操作id
     * @param czfid         操作方id
     * @param requestString post的传入参数字符串
     * @return
     */

    public ResultRet postResultJson(String ywlyid, String czid, String czfid, String requestString) {

        return postResultJson(ywlyid, czid, czfid, requestString, null, "", true);
    }

    /**
     * 通过构件内码调用参数并返回数据
     *
     * @param ywlyid     业务来源id
     * @param czid       操作id
     * @param czfid      操作方id
     * @param requestMap post的传入参数
     * @return
     */
    public ResultRet postResultMap(String ywlyid, String czid, String czfid, Map requestMap) {

        return postResultJson(ywlyid, czid, czfid, "", requestMap, "", false);
    }

    @Deprecated
    private ResultRet postResultJson(String ywlyid, String czid, String czfid, String requestString, Map requestMap, String url, boolean isString) {
        ResultRet resultRetCMP = getCMPInvokeSetting(ywlyid, czid, czfid);
        if (resultRetCMP.getCode() == 0) {
            return resultRetCMP;
        }
        if (resultRetCMP.getCode() == -1) {
            return resultRetCMP;
        }
        resultRetCMP.setCode(0);
        resultRetCMP.setResult(false);
        JZFSSPComponentInvokeDO JZFSSPComponentInvokeDO = (JZFSSPComponentInvokeDO) resultRetCMP.getValue();

        if (isString) {
            return JZFSSPCMPInvoke.postResultJson(JZFSSPComponentInvokeDO.getFsspcomponentinvoke_gjid(), requestString, url);
        } else {
            return JZFSSPCMPInvoke.postResultMap(JZFSSPComponentInvokeDO.getFsspcomponentinvoke_gjid(), requestMap);
        }
    }

    public ResultRet RpcResultUntil(String gjid, LinkedHashMap<String, Object> paramsInfo) {
        try {
            ResultRet rerFsspComponentInvoke = JZFSSPCMPInvoke.getFsspComponentInvoke(gjid);
            if (!rerFsspComponentInvoke.isResult()) {
                rerFsspComponentInvoke.setResult(false);
                rerFsspComponentInvoke.setMessage("未预制调用构件信息");
                return rerFsspComponentInvoke;
            }
            JZFSSPComponentInvokeDO fsspComponentInvokeDTO = (JZFSSPComponentInvokeDO) rerFsspComponentInvoke.getValue();
            String su = String.valueOf(fsspComponentInvokeDTO.getFsspcomponentinvoke_su());
            String servicename = String.valueOf(fsspComponentInvokeDTO.getFsspcomponentinvoke_sname());
            String methodpath = String.valueOf(fsspComponentInvokeDTO.getFsspcomponentinvoke_mpath());
            if ("null".equals(su) || StringUtils.isEmpty(su) || "null".equals(servicename) || StringUtils.isEmpty(servicename) || "null".equals(methodpath) || StringUtils.isEmpty(methodpath)) {
                rerFsspComponentInvoke.setResult(false);
                rerFsspComponentInvoke.setMessage("预制信息不完善,请检查对应su/sname/mpath的预制信息。");
                return rerFsspComponentInvoke;
            }
            try {
                return rpcClient.invoke(
                        ResultRet.class,
                        methodpath,
                        su,
                        paramsInfo,
                        null
                );
            } catch (Exception e) {
                String error = JZFSSPRpcClient.getErrorMassage(e);
                throw new Exception(error);
            }
        } catch (Exception ex) {
            ResultRet errorBack = new ResultRet();
            errorBack.setValue(ex);
            errorBack.setResult(false);
            errorBack.setMessage(ex.toString());
            ex.printStackTrace();
            return errorBack;
        }


    }

    //for 无法约束使用方的返回值时，比如回写等。对返回值要进行处理和包装
    public ResultRet RpcResultUntilObject(String gjid, LinkedHashMap<String, Object> paramsInfo) {
        try {
            ResultRet rerFsspComponentInvoke = JZFSSPCMPInvoke.getFsspComponentInvoke(gjid);
            if (!rerFsspComponentInvoke.isResult()) {
                rerFsspComponentInvoke.setResult(false);
                rerFsspComponentInvoke.setMessage("未预制调用构件信息");
                return rerFsspComponentInvoke;
            }
            JZFSSPComponentInvokeDO fsspComponentInvokeDTO = (JZFSSPComponentInvokeDO) rerFsspComponentInvoke.getValue();
            String su = String.valueOf(fsspComponentInvokeDTO.getFsspcomponentinvoke_su());
            String servicename = String.valueOf(fsspComponentInvokeDTO.getFsspcomponentinvoke_sname());
            String methodpath = String.valueOf(fsspComponentInvokeDTO.getFsspcomponentinvoke_mpath());
            if ("null".equals(su) || StringUtils.isEmpty(su) || "null".equals(servicename) || StringUtils.isEmpty(servicename) || "null".equals(methodpath) || StringUtils.isEmpty(methodpath)) {
                rerFsspComponentInvoke.setResult(false);
                rerFsspComponentInvoke.setMessage("预制信息不完善,请检查对应su/sname/mpath的预制信息。");
                return rerFsspComponentInvoke;
            }
            ResultRet backReturnInfo = new ResultRet();
            backReturnInfo.setResult(true);

            try {

                backReturnInfo.setValue(rpcClient.invoke(
                        Object.class,
                        methodpath,
                        su,
                        paramsInfo,
                        null
                ));

                return backReturnInfo;

            } catch (Exception e) {
                String error = getErrorMassage(e);
                throw new Exception(error);
            }
        } catch (Exception ex) {
            ResultRet errorBack = new ResultRet();
            errorBack.setValue(ex);
            errorBack.setResult(false);
            errorBack.setMessage(ex.toString());
            ex.printStackTrace();
            return errorBack;
        }


    }

    public ResultRet getCMPInvokeSetting(String ywlyid, String czid, String czfid) {

        ResultRet resultRet = new ResultRet();
        resultRet.setCode(0);
        resultRet.setResult(false);

        JZFSSPComponentInvokeDO JZFSSPComponentInvokeDO = new JZFSSPComponentInvokeDO();

        Query query = entityManager.createNativeQuery("select fsspcomponentinvoke_nm \"fsspcomponentinvoke_nm\",fsspcomponentinvoke_ywlyid \"fsspcomponentinvoke_ywlyid\",fsspcomponentinvoke_ywlymc \"fsspcomponentinvoke_ywlymc\",fsspcomponentinvoke_gjid \"fsspcomponentinvoke_gjid\",fsspcomponentinvoke_gjmc \"fsspcomponentinvoke_gjmc\",fsspcomponentinvoke_czid \"fsspcomponentinvoke_czid\",fsspcomponentinvoke_czmc \"fsspcomponentinvoke_czmc\",fsspcomponentinvoke_czfid \"fsspcomponentinvoke_czfid\",fsspcomponentinvoke_invoketype \"fsspcomponentinvoke_invoketype\",fsspcomponentinvoke_mpath \"fsspcomponentinvoke_mpath\",fsspcomponentinvoke_sname \"fsspcomponentinvoke_sname\",fsspcomponentinvoke_su \"fsspcomponentinvoke_su\",postdatatype \"postdatatype\" from fsspcomponentinvoke where fsspcomponentinvoke_ywlyid ='" + ywlyid + "' and fsspcomponentinvoke_czid='" + czid + "' and fsspcomponentinvoke_czfid='" + czfid + "'\n");
//        query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        List listFSSPCMP = query.getResultList();

        if (listFSSPCMP.size() > 0) {
            Map mapCMP = (Map) listFSSPCMP.get(0);
            JZFSSPComponentInvokeDO.setFsspcomponentinvoke_nm(String.valueOf(mapCMP.get("fsspcomponentinvoke_nm")));
            JZFSSPComponentInvokeDO.setFsspcomponentinvoke_ywlyid(String.valueOf(mapCMP.get("fsspcomponentinvoke_ywlyid")));
            JZFSSPComponentInvokeDO.setFsspcomponentinvoke_ywlymc(String.valueOf(mapCMP.get("fsspcomponentinvoke_ywlymc")));
            JZFSSPComponentInvokeDO.setFsspcomponentinvoke_gjid(String.valueOf(mapCMP.get("fsspcomponentinvoke_gjid")));
            JZFSSPComponentInvokeDO.setFsspcomponentinvoke_gjmc(String.valueOf(mapCMP.get("fsspcomponentinvoke_gjmc")));
            JZFSSPComponentInvokeDO.setFsspcomponentinvoke_czid(String.valueOf(mapCMP.get("fsspcomponentinvoke_czid")));
            JZFSSPComponentInvokeDO.setFsspcomponentinvoke_czmc(String.valueOf(mapCMP.get("fsspcomponentinvoke_czmc")));
            JZFSSPComponentInvokeDO.setFsspcomponentinvoke_czfid(String.valueOf(mapCMP.get("fsspcomponentinvoke_czfid")));
            JZFSSPComponentInvokeDO.setFsspcomponentinvoke_invoketype(String.valueOf(mapCMP.get("fsspcomponentinvoke_invoketype")));
            JZFSSPComponentInvokeDO.setFsspcomponentinvoke_mpath(String.valueOf(mapCMP.get("fsspcomponentinvoke_mpath")));
            JZFSSPComponentInvokeDO.setFsspcomponentinvoke_sname(String.valueOf(mapCMP.get("fsspcomponentinvoke_sname")));
            JZFSSPComponentInvokeDO.setFsspcomponentinvoke_su(String.valueOf(mapCMP.get("fsspcomponentinvoke_su")));
            JZFSSPComponentInvokeDO.setPostdatatype(String.valueOf(mapCMP.get("postdatatype")));
            resultRet.setCode(1);
            resultRet.setResult(true);
            resultRet.setValue(JZFSSPComponentInvokeDO);
        } else {
            resultRet.setCode(-1);
            resultRet.setMessage("未找到对应INVOKE构件ywlyid:" + ywlyid + "_czid:" + czid + "_czfid:" + czfid);
            return resultRet;
        }

        return resultRet;
    }


}
