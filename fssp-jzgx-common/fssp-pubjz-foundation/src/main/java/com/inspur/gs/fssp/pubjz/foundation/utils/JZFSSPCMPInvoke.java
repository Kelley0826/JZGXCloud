package com.inspur.gs.fssp.pubjz.foundation.utils;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZFSSPCMPDO;
import com.inspur.gs.fssp.pubjz.foundation.entity.JZFSSPComponentInvokeDO;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPJSONSerializer;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPRpcClient;
import io.iec.edp.caf.rpc.api.service.RpcClient;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.Clob;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class JZFSSPCMPInvoke {
    /**
     * 注册entityManager  实体管理，共享
     */
    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private RpcClient rpcClient;
    @Autowired
    JZFSSPIpConfig ip;

    /**
     * 通过构件内码调用参数并返回数据  支持RPC 20191220 no Tim
     *
     * @param gjID          预制的构件内码
     * @param requestString post的传入参数字符串
     * @param url           此url为构件预制后的剩余url自定义组织，比如url中带变量参数等
     * @return
     */

    @Deprecated
    protected ResultRet postResultJson(String gjID, String requestString, String url) {

        return postResult(gjID, requestString, null, url, true);
    }


    /**
     * 通过构件内码调用参数并返回数据
     *
     * @param gjID          预制的构件内码
     * @param requestString post的传入参数字符串
     * @return
     */

    public ResultRet postResultJson(String gjID, String requestString) {

        return postResult(gjID, requestString, null, "", true);
    }


    /**
     * 通过构件内码调用参数并返回数据
     *
     * @param gjID          预制的构件内码
     * @param requestMap post的传入参数
     * @return
     */
    public ResultRet postResultMap(String gjID, Map requestMap) {

        return postResult(gjID, "", requestMap, "",false);
    }
    public ResultRet postResult(String gjID, String requestString, Map requestMap, String url, boolean isString) {
        try {
            ResultRet resultRetComponent = getFsspComponentInvoke(gjID);
            if (!resultRetComponent.isResult()) {
                //无法从 fsspcomponentInvoke找到的 说明原来走的是FSSPOKHttpClient 不再支持
                return resultRetComponent;
//                ResultRet resultRetCMP = getCMPInvokeSetting(gjID);
//                if (resultRetCMP.getCode() == 0) {
//                    return resultRetCMP;
//                }
//                resultRetCMP.setCode(0);
//                resultRetCMP.setResult(false);
//
//                //如果找不到说明这个构件只在fsspcmp中，
//                FSSPCMPDO FSSPCMPDO = (FSSPCMPDO) resultRetCMP.getValue();
//                if ("put".equals(FSSPCMPDO.getFsspcmp_requsettype().toLowerCase())) {
//                    resultRetCMP.setValue(FSSPOKHttpClient.putResultJson(FSSPCMPDO.getFsspcmp_head() + FSSPCMPDO.getFsspcmp_ip() + ":" + FSSPCMPDO.getFsspcmp_port() + FSSPCMPDO.getFsspcmp_urlpath() + url, requestString));
//
//                } else {
//                    resultRetCMP.setValue(FSSPOKHttpClient.postResultJson(FSSPCMPDO.getFsspcmp_head() + FSSPCMPDO.getFsspcmp_ip() + ":" + FSSPCMPDO.getFsspcmp_port() + FSSPCMPDO.getFsspcmp_urlpath() + url, requestString));
//
//                }
//                resultRetCMP.setResult(true);
//                resultRetCMP.setCode(1);
//                return resultRetCMP;
            }
            JZFSSPComponentInvokeDO fsspComponentInvokeDTO = (JZFSSPComponentInvokeDO) resultRetComponent.getValue();
            if ("platformrpc".equals(fsspComponentInvokeDTO.getFsspcomponentinvoke_invoketype().toLowerCase())) {
                String su = String.valueOf(fsspComponentInvokeDTO.getFsspcomponentinvoke_su());
                String servicename = String.valueOf(fsspComponentInvokeDTO.getFsspcomponentinvoke_sname());
                String methodpath = String.valueOf(fsspComponentInvokeDTO.getFsspcomponentinvoke_mpath());

                //提高性能，少转换一次
                if (isString) {
                    if ("map".equals(fsspComponentInvokeDTO.getPostdatatype())) {

                        HashMap<String, Object> requestMapSelf = JZFSSPJSONSerializer.deserialize(requestString, HashMap.class);
                        return rpcClient.invoke(
                                ResultRet.class,
                                methodpath,
                                su,
                                new LinkedHashMap<String, Object>() {
                                    {
                                        put("params", requestMapSelf);
                                    }
                                },
                                null
                        );
                    } else {
                        //final LinkedHashMap<String,Object> params= FSSPJSONSerializer.deserialize(requsetBody,LinkedHashMap.class);

                        try {
                            return rpcClient.invoke(
                                    ResultRet.class,
                                    methodpath,
                                    su,
                                    new LinkedHashMap<String, Object>() {
                                        {
                                            put("params", requestString);
                                        }
                                    },
                                    null
                            );
                        } catch (Exception e) {
                            String error = JZFSSPRpcClient.getErrorMassage(e);
                            throw new Exception(error);
                        }
                    }

                } else {

                    if ("map".equals(fsspComponentInvokeDTO.getPostdatatype())) {

                        return rpcClient.invoke(
                                ResultRet.class,
                                methodpath,
                                su,
                                new LinkedHashMap<String, Object>() {
                                    {
                                        put("params", requestMap);
                                    }
                                },
                                null
                        );
                    } else {
                        String requestStringSelf = JZFSSPJSONSerializer.serialize(requestMap);
                        try {
                            return rpcClient.invoke(
                                    ResultRet.class,
                                    methodpath,
                                    su,
                                    new LinkedHashMap<String, Object>() {
                                        {
                                            put("params", requestStringSelf);
                                        }
                                    },
                                    null
                            );
                        } catch (Exception e) {
                            String error = JZFSSPRpcClient.getErrorMassage(e);
                            throw new Exception(error);
                        }
                    }

                }

            }

            else {
                ResultRet resultRetCMP=new ResultRet();
                resultRetCMP.setResult(false);
                resultRetCMP.setMessage("只支持invoketype为platformrpc的情况,请修改对应API和数据库预制");
                return resultRetCMP;
//                ResultRet resultRetCMP = getCMPInvokeSetting(gjID);
//                if (resultRetCMP.getCode() == 0) {
//                    return resultRetCMP;
//                }
//                resultRetCMP.setCode(0);
//                resultRetCMP.setResult(false);
//                FSSPCMPDO FSSPCMPDO = (FSSPCMPDO) resultRetCMP.getValue();
//                String port = FSSPCMPDO.getFsspcmp_port();
//                if ("5200".equals(port)) {
//                    port = String.valueOf(ip.getPort());
//                }
//                if ("put".equals(FSSPCMPDO.getFsspcmp_requsettype().toLowerCase())) {
//                    resultRetCMP.setValue(FSSPOKHttpClient.putResultJson(FSSPCMPDO.getFsspcmp_head() + FSSPCMPDO.getFsspcmp_ip() + ":" + port + FSSPCMPDO.getFsspcmp_urlpath() + url, requestString));
//
//                } else {
//                    resultRetCMP.setValue(FSSPOKHttpClient.postResultJson(FSSPCMPDO.getFsspcmp_head() + FSSPCMPDO.getFsspcmp_ip() + ":" + port + FSSPCMPDO.getFsspcmp_urlpath() + url, requestString));
//
//                }
//                resultRetCMP.setResult(true);
//                resultRetCMP.setCode(1);
//                return resultRetCMP;
            }
        } catch (
                Exception ex) {
            ResultRet errorBack = new ResultRet();
            errorBack.setValue(ex);
            errorBack.setResult(false);
            errorBack.setMessage(ex.toString());
            ex.printStackTrace();
            // throw new RuntimeException(ex);

            return errorBack;
        }

    }


    private ResultRet getCMPInvokeSetting(String gjID) {

        ResultRet resultRet = new ResultRet();
        resultRet.setCode(0);
        resultRet.setResult(false);

        JZFSSPCMPDO JZFSSPCMPDO = new JZFSSPCMPDO();

        Query query = entityManager.createNativeQuery("SELECT fsspcmp_nm \"fsspcmp_nm\",fsspcmp_head \"fsspcmp_head\",fsspcmp_ip \"fsspcmp_ip\",fsspcmp_port \"fsspcmp_port\",fsspcmp_urlpath \"fsspcmp_urlpath\",fsspcmp_name \"fsspcmp_name\",fsspcmp_requsettype \"fsspcmp_requsettype\" FROM FSSPCMP WHERE FSSPCMP_NM ='" + gjID + "'");
        query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        List listFSSPCMP = query.getResultList();

        if (listFSSPCMP.size() > 0) {
            Map mapCMP = (Map) listFSSPCMP.get(0);
            JZFSSPCMPDO.setFsspcmp_nm(String.valueOf(mapCMP.get("fsspcmp_nm")));
            JZFSSPCMPDO.setFsspcmp_head(String.valueOf(mapCMP.get("fsspcmp_head")));
            JZFSSPCMPDO.setFsspcmp_ip(String.valueOf(mapCMP.get("fsspcmp_ip")));
            JZFSSPCMPDO.setFsspcmp_port(String.valueOf(mapCMP.get("fsspcmp_port")));
            try {
                Object fsspUrlPath = mapCMP.get("fsspcmp_urlpath");
                if (fsspUrlPath instanceof Clob) {
                    Clob clobUrlPath = (Clob) mapCMP.get("fsspcmp_urlpath");
                    if (clobUrlPath != null) {
                        String strUrlPath = clobUrlPath.getSubString((long) 1, (int) clobUrlPath.length());
                        JZFSSPCMPDO.setFsspcmp_urlpath(strUrlPath);
                    }
                } else {
                    JZFSSPCMPDO.setFsspcmp_urlpath(String.valueOf(mapCMP.get("fsspcmp_urlpath")));
                }
            } catch (Exception ex) {
                resultRet.setMessage("获取fsspcmp_urlpath异常：" + ex.toString());
                JZFSSPCMPDO.setFsspcmp_urlpath(String.valueOf(mapCMP.get("fsspcmp_urlpath")));
            }

            JZFSSPCMPDO.setFsspcmp_name(String.valueOf(mapCMP.get("fsspcmp_name")));
            JZFSSPCMPDO.setFsspcmp_requsettype(String.valueOf(mapCMP.get("fsspcmp_requsettype")));
            resultRet.setCode(1);
            resultRet.setResult(true);
            resultRet.setValue(JZFSSPCMPDO);
        } else {
            resultRet.setCode(-1);
            resultRet.setMessage("未找到对应构件：" + gjID);
            return resultRet;
        }

        return resultRet;
    }


    public ResultRet getFsspComponentInvoke(String gjId) {

        ResultRet resultRet = new ResultRet();
        resultRet.setCode(0);
        resultRet.setResult(false);

        JZFSSPComponentInvokeDO JZFSSPComponentInvokeDO = new JZFSSPComponentInvokeDO();

        Query query = entityManager.createNativeQuery("select fsspcomponentinvoke_nm \"fsspcomponentinvoke_nm\",fsspcomponentinvoke_ywlyid \"fsspcomponentinvoke_ywlyid\",fsspcomponentinvoke_ywlymc \"fsspcomponentinvoke_ywlymc\",fsspcomponentinvoke_gjid \"fsspcomponentinvoke_gjid\",fsspcomponentinvoke_gjmc \"fsspcomponentinvoke_gjmc\",fsspcomponentinvoke_czid \"fsspcomponentinvoke_czid\",fsspcomponentinvoke_czmc \"fsspcomponentinvoke_czmc\",fsspcomponentinvoke_czfid \"fsspcomponentinvoke_czfid\",fsspcomponentinvoke_invoketype \"fsspcomponentinvoke_invoketype\",fsspcomponentinvoke_mpath \"fsspcomponentinvoke_mpath\",fsspcomponentinvoke_sname \"fsspcomponentinvoke_sname\",fsspcomponentinvoke_su \"fsspcomponentinvoke_su\",postdatatype \"postdatatype\" from fsspcomponentinvoke where fsspcomponentinvoke_gjid ='" + gjId + "'");
        query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

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
            resultRet.setMessage("未找到对应构件，ID:" + gjId);
            return resultRet;
        }
        return resultRet;
    }
}
