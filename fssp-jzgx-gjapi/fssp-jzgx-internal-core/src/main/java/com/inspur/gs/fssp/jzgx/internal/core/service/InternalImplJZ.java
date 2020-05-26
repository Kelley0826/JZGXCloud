package com.inspur.gs.fssp.jzgx.internal.core.service;

//import com.inspur.gs.bf.df.commonservice.api.IExchangeRateService;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.pubjz.foundation.utils.JZFSSPComponentInvoke;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPJSONSerializer;
import com.inspur.gs.fssp.jzgx.internal.api.InternalApiJZ;
import io.iec.edp.caf.rpc.api.service.RpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class InternalImplJZ implements InternalApiJZ {

    private Logger logger = LoggerFactory.getLogger(InternalImplJZ.class);
    @Autowired
    private JZFSSPComponentInvoke JZFSSPComponentInvoke;//构件
    @Autowired
    private RpcClient rpcClient; //RPC远程调用
//    @Autowired
//    private IExchangeRateService iExchangeRateService;

    /**
     * 保存FSBZDJ(新的，使用RPC)
     */
    @Override
    @RequestMapping(value = "/saveFSBZDJ", method = RequestMethod.GET)
    public ResultRet saveFSBZDJ(Map<String, Object> data) {
        ResultRet ret = new ResultRet();
        logger.info("单据保存入参："+data.toString());

        String gnid = (String) data.get("gnid");
        Map<String, Object> fsbzdj = (Map<String, Object>)data.get("fsbzdj");

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("GNID",gnid);
        paramMap.put("FSBZDJ",fsbzdj);
        try{
            LinkedHashMap<String,Object> infos =new LinkedHashMap<>();
            infos.put("inParam", paramMap);
            ret = rpcClient.invoke(ResultRet.class,
                    "com.inspur.gs.fssp.sp.api.FSBillService.saveBill",
                    "fsbz",
                    infos,
                    null
            );
        }catch (Exception e){
            logger.info("saveFSBZDJ异常： " ,e);
            String errorMessage = getErrorMassage(e);
            ret.setResult(false);
            ret.setMessage(errorMessage);
        }
        return ret;
    }
    /**
     * 保存
     */
    @Override
    @Deprecated
    public ResultRet saveFSBZDJ(String gnid, String fsbzdj) {
        ResultRet ret = new ResultRet();
        HashMap<String, String> paramMap = new HashMap<String, String>();
        paramMap.put("GNID",gnid);
        paramMap.put("FSBZDJ",fsbzdj);
        String ywlyid = "FSSP";
        String czid = "savebill";
        String czfid = "FSSP";
        String requestParam = JZFSSPJSONSerializer.serialize(paramMap);
        try{
            ret = JZFSSPComponentInvoke.postResultJson(ywlyid,czid,czfid,requestParam);
            if(!ret.isResult()){
                return   ret;
            }
            ret = JZFSSPJSONSerializer.deserialize(ret.getValue().toString(), ResultRet.class);
        }catch (Exception e){
            ret.setResult(false);
            ret.setMessage(e.getMessage());
        }
        return ret;
    }

    /**
     * 删除FSBZDJ
     */
    @Override
    public ResultRet delete(Map<String, Object> data) {
        ResultRet ret = new ResultRet();
        ret.setResult(true);
//        HashMap<String, String> paramMap = new HashMap<String, String>();
//        String ywlyid = "FSSP";
//        String czid = "delete";
//        String czfid = "FSSP";
//        String requestParam = FSSPJSONSerializer.serialize(data);


        try{
//            ret = fsspComponentInvoke.postResultJson(ywlyid,czid,czfid,requestParam);
//            if(!ret.isResult()){
//                return   ret;
//            }
//            ret = FSSPJSONSerializer.deserialize(ret.getValue().toString(), ResultRet.class);
            LinkedHashMap<String,Object> infos =new LinkedHashMap<>();
            infos.put("inParam", data);
            ret = rpcClient.invoke(ResultRet.class,
                    "com.inspur.gs.fssp.sp.api.FSBillService.deleteBill",
                    "fsbz",
                    infos,
                    null
            );
        }catch (Exception e){
            String errorMessage = getErrorMassage(e);
            ret.setResult(false);
            ret.setMessage(errorMessage);
        }
        return ret;
    }


    /**
     * 更新流程其他信息
     */
    @Override
    @RequestMapping(value = "/updatePfrutasks", method = RequestMethod.GET)
    public ResultRet updatePfrutasks(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        logger.info("更新流程其他信息入参：" + billInfo.toString());
        try {
            LinkedHashMap<String,Object> infos =new LinkedHashMap<>();
            infos.put("map", billInfo);
            resultRet =  rpcClient.invoke(ResultRet.class,
                    "com.inspur.gs.pf.api.PFInterfaceApi.updatePfrutasks",
                    "fspf",
                    infos,
                    null
            );

        } catch (Exception e) {
            String errorMessage = getErrorMassage(e);
            //String errorMessage = ((Exception)((Exception)(e.getCause())).getCause()).getLocalizedMessage();
            logger.info("更新流程其他信息报错：" + errorMessage);
            resultRet.setResult(false);
            resultRet.setMessage(errorMessage);
        }
        return resultRet;
    }


    /**
     * 提交-启动审批流
     */
    @Override
    @RequestMapping(value = "/submitApprove", method = RequestMethod.GET)
    public ResultRet submitApprove(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        logger.info("单据提交入参："+billInfo.toString());
        try{
            //resultRet = pfInterfaceApi.startProcessAndDefineBusinessKey((HashMap<String, Object>)billInfo);`
            LinkedHashMap<String,Object> infos =new LinkedHashMap<>();
            infos.put("map", billInfo);
            resultRet = rpcClient.invoke(ResultRet.class,
                    "com.inspur.gs.pf.api.PFInterfaceApi.startProcessAndDefineBusinessKey",
                    "fspf",
                    infos,
                    null
            );

            logger.info("单据提交返回结果："+resultRet);
        }catch(Exception e){
            String errorMessage = getErrorMassage(e);
            //String errorMessage = ((Exception)((Exception)(e.getCause())).getCause()).getLocalizedMessage();
            logger.info("单据提交调用流程报错："+errorMessage);
            resultRet.setResult(false);
            resultRet.setMessage(errorMessage);
        }
        return resultRet;
    }

    private static String getErrorMassage(Exception e){
        String errorMessage="";
        if (e != null) {
            //如果为error则，直接返回
            if(e.getCause() instanceof  Error){
                e.printStackTrace();
                return e.toString();
            }
            Exception firstExc=(Exception)e.getCause();
            if (firstExc!= null) {
                //如果为error，直接返回
                if(firstExc.getCause() instanceof Error){
                    firstExc.printStackTrace();
                    return firstExc.toString();
                }
                Exception secondExc=(Exception)firstExc.getCause();
                if (secondExc != null) {
                    errorMessage = secondExc.getLocalizedMessage();
                    if( secondExc.getLocalizedMessage() == null ||  secondExc.getLocalizedMessage() == ""){
                        errorMessage = ((InvocationTargetException) secondExc).getTargetException().getLocalizedMessage();
                    }
                } else{
                    errorMessage = firstExc.toString();
                }
            }else{
                errorMessage = e.getMessage();
            }
        }
        return errorMessage;
    }

    /**
     * 撤回
     */
    @Override
    @RequestMapping(value = "/retractApprove", method = RequestMethod.GET)
    public ResultRet retractApprove(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        logger.info("单据撤回入参："+billInfo.toString());
        try{
            //resultRet = pfInterfaceApi.backToLastNode((HashMap<String, Object>)billInfo);
            HashMap<String,Object> infos =new HashMap<>();
            infos.put("map", billInfo);
            resultRet = rpcClient.invokeService(ResultRet.class,
                    "com.inspur.gs.pf.api.PFInterfaceApi.backToLastNode",
                    "fspf",
                    infos,
                    null
            );

            logger.info("单据撤回返回结果："+resultRet);
        }catch(Exception e){
            String errorMessage = getErrorMassage(e);
            logger.info("单据撤回调用流程报错："+errorMessage);
            resultRet.setResult(false);
            resultRet.setMessage(errorMessage);
        }
        return resultRet;
    }

    /**
     * 通过前
     */
    @Override
    @RequestMapping(value = "/approvePassBefore", method = RequestMethod.GET)
    public ResultRet approvePassBefore(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        logger.info("单据通过前入参："+billInfo.toString());
        try{
            HashMap<String,Object> infos =new HashMap<>();
            infos.put("map", billInfo);
            resultRet = rpcClient.invokeService(ResultRet.class,
                    "com.inspur.gs.pf.api.PFInterfaceApi.beforePass",
                    "fspf",
                    infos,
                    null
            );
            logger.info("单据通过前返回结果："+resultRet);
        }catch(Exception e){
            String errorMessage = getErrorMassage(e);
            logger.info("单据调用流程通过前报错："+errorMessage);
            resultRet.setResult(false);
            resultRet.setMessage(errorMessage);
        }
        return resultRet;
    }

    /**
     * 通过
     */
    @Override
    @RequestMapping(value = "/approvePass", method = RequestMethod.GET)
    public ResultRet approvePass(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        logger.info("单据通过入参："+billInfo.toString());
        try{
            //resultRet = pfInterfaceApi.completetoNextProcessNode((HashMap<String, Object>)billInfo);
            HashMap<String,Object> infos =new HashMap<>();
            infos.put("map", billInfo);
            resultRet = rpcClient.invokeService(ResultRet.class,
                    "com.inspur.gs.pf.api.PFInterfaceApi.completetoNextProcessNode",
                    "fspf",
                    infos,
                    null
            );
            logger.info("单据通过返回结果："+resultRet);
        }catch(Exception e){
            String errorMessage = getErrorMassage(e);
            logger.info("单据调用流程通过报错："+errorMessage);
            resultRet.setResult(false);
            resultRet.setMessage(errorMessage);
        }
        return resultRet;
    }

    /**
     * 退回前
     */
    @Override
    @RequestMapping(value = "/approveBackBefore", method = RequestMethod.GET)
    public ResultRet approveBackBefore(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        logger.info("单据退回前入参："+billInfo.toString());
        try{
            HashMap<String,Object> infos =new HashMap<>();
            infos.put("map", billInfo);
            resultRet =  rpcClient.invokeService(ResultRet.class,
                    "com.inspur.gs.pf.api.PFInterfaceApi.beforeReturn",
                    "fspf",
                    infos,
                    null
            );
            logger.info("单据退回前返回结果："+resultRet);
        }catch(Exception e){
            String errorMessage = getErrorMassage(e);
            logger.info("单据调用流程退回前报错："+errorMessage);
            resultRet.setResult(false);
            resultRet.setMessage(errorMessage);
        }
        return resultRet;
    }

    /**
     * 退回
     */
    @Override
    @RequestMapping(value = "/approveBack", method = RequestMethod.GET)
    public ResultRet approveBack(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        logger.info("单据退回入参："+billInfo.toString());
        try{
            //resultRet = pfInterfaceApi.backToTargetProcessnode((HashMap<String, Object>) billInfo);
            HashMap<String,Object> infos =new HashMap<>();
            infos.put("map", billInfo);
            resultRet =  rpcClient.invokeService(ResultRet.class,
                    "com.inspur.gs.pf.api.PFInterfaceApi.backToTargetProcessnode",
                    "fspf",
                    infos,
                    null
            );

            logger.info("单据退回返回结果："+resultRet);
        }catch(Exception e){
            String errorMessage = getErrorMassage(e);
            logger.info("单据退回调用流程报错："+errorMessage);
            resultRet.setResult(false);
            resultRet.setMessage(errorMessage);
        }
        return resultRet;
    }

    /**
     * 报账类型定义保存
     * */
    @Override
    public ResultRet saveBZLX(HashMap<String, Object> savaData) {
        ResultRet ret;
        String ywlyid = "FSPF";
        String czid = "addpfgeformtype";
        String czfid = "FSRO";
        String requestParam = JZFSSPJSONSerializer.serialize(savaData);
        ret = JZFSSPComponentInvoke.postResultJson(ywlyid,czid,czfid,requestParam);

        return ret;
    }

    /**
     * 报账类型定义删除
     * */
    @Override
    public ResultRet deleteBZLX(HashMap<String, Object> deleteData) {
        ResultRet ret;
        String ywlyid = "FSPF";
        String czid = "deletepfgeformtype";
        String czfid = "FSRO";
        String requestParam = JZFSSPJSONSerializer.serialize(deleteData);
        ret = JZFSSPComponentInvoke.postResultJson(ywlyid,czid,czfid,requestParam);
        return ret;
    }


}
