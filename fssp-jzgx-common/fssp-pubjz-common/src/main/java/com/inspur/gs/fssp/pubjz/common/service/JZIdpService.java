package com.inspur.gs.fssp.pubjz.common.service;

import com.inspur.fastdweb.bean.CardData;
import com.inspur.fastdweb.bean.CustomModel;
import com.inspur.fastdweb.bean.CustomRuntimeDim;
import com.inspur.fastdweb.bean.SqlField;
import com.inspur.fastdweb.custom.CustomService;
import com.inspur.fastdweb.custom.StyleCustomService;
import com.inspur.fastdweb.dao.runtime.ClassTypeMapper;
import com.inspur.fastdweb.model.custom.StyleCustom;
import com.inspur.fastdweb.model.runtime.ClassType;
import com.inspur.fastdweb.service.CodeService;
import com.inspur.fastdweb.service.MgrCardService;
import com.inspur.fastdweb.util.AesUtil;
import com.inspur.fastdweb.util.SqlWhereUtil;
import com.inspur.gs.fssp.pubjz.common.entity.*;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPSQLFilter;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPSession;
import io.iec.edp.caf.common.JSONSerializer;
import io.iec.edp.caf.commons.dataaccess.DbType;
import org.apache.cxf.common.util.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Character.toLowerCase;

/**
 * idp服务
 *
 * @author chiller &&tim
 * since  version 1.0.0.0
 */
@Service
public class JZIdpService {
    @Autowired
    private MgrCardService mgrCardService;
    @Autowired
    private CustomService customService;
    @Autowired
    private StyleCustomService styleCustomService;
    //ClassTypeService  目前确少根据ID获取维度信息的方法，先临时调用他的mapper
    @Autowired
    private ClassTypeMapper classTypeMapper;
    @Autowired
    private CodeService codeService;

    /**
     * 保存
     *
     * @param saveData
     * @return
     */
    public Object SaveData(JZFSSaveDataVO saveData) {
        String data = JSONSerializer.serialize(saveData.idpCardData);
        CardData cardData = JSONSerializer.deserialize(data, CardData.class);
        return mgrCardService.saveCardData(cardData);
//        return new MgrCardService().saveCardData(cardData);
    }

    /**
     * 生成编号
     * @param id
     * @param data
     * @return
     */
    public String createCode(String id ,Map data){
        return codeService.createCode(id,data);
    }

    /**
     * @param fields
     * @return
     */
    public static String getSqlWhere(List<JZIdpSqlFiledVO> fields) {
        List<SqlField> idpSqlFields = new ArrayList<SqlField>();
        idpSqlFields.addAll(fields);
        if (!CollectionUtils.isEmpty(idpSqlFields)) {
            for (int i = 0; i < idpSqlFields.size(); i++) {
                SqlField filed = (SqlField) idpSqlFields.get(i);
                if (filed.isExpress || "in".equals(filed.operate.toLowerCase()) || "not in".equals(filed.operate.toLowerCase())) {
                    filed.value = decrypt(String.valueOf(filed.value), "fastdwebfastdweb");
                }
                DbType dbType= JZFSSPSession.current.getDbType();
                if(filed.isDate && dbType.equals(DbType.Oracle) )
                {
//                   idpSqlFields.get(i).value=" Date " + idpSqlFields.get(i).value;
                    idpSqlFields.get(i).operate=filed.operate+" Date";
                }
                if((!filed.isExpress)&&filed.value!=null&&!("in".equals(filed.operate.toLowerCase())))
                {
                    idpSqlFields.get(i).value= JZFSSPSQLFilter.filter(String.valueOf(filed.value));

                }
                else {
                    idpSqlFields.get(i).value= filed.value;
                }

            }
        }

        return SqlWhereUtil.getSqlWhere(idpSqlFields);
    }


    public static String decrypt(String content, String key) {
        return AesUtil.decrypt(content, key);
    }

    public Object getCardData(String styleId, String Id) {
        return mgrCardService.getCardData(styleId, Id);
    }

    /**
     * @param JZCustomModelVO
     * @return runtimeFormInfo.put(" rootId ", customModel.styleId);
     * runtimeFormInfo.put("styleId", formRelation.get("styleId"));
     * runtimeFormInfo.put("formatId", formRelation.get("formatId"));
     * runtimeFormInfo.put("level", 1);
     * runtimeFormInfo.put("custom", styleCustom);
     */
    public CustomRuntimeDim getCustomFromRelation(JZCustomModelVO JZCustomModelVO) {
        return customService.getCustomFromRelation((CustomModel) JZCustomModelVO);
    }

    /**
     * @param styleId
     * @param firstValue
     * @param secondValue
     * @return cutomResult.put(" tyleId ", realStyleId);
     * cutomResult.put("formatId", formatId);
     */
    public Map<String, String> getCustomByDimValue(String styleId, final String firstValue, final String secondValue) {
        return customService.getCustomByDimValue(styleId, firstValue, secondValue);
    }

    /**
     * 根据基础表单ID 获取基础表单信息
     *
     * @param id
     * @return
     */
    public StyleCustom getCustom(String id) {
        return  styleCustomService.getCustom(id);
    }

    /**
     * 获取维度信息表名、取数字段等
     * @param id  getClassTypeConfig
     * @return
     */
    public ClassType getClassType(String id)
    {
        return classTypeMapper.get(id);
    }

    /**
     * 新增扩展表单保存
     * @param styleDimVO
     * @return
     */

    /*
    public boolean saveDim(final StyleDimVO styleDimVO) {
        StyleDim styleDim =new StyleDim();
        styleDim.beId=styleDimVO.getBeId();
        styleDim.extendLevel=styleDimVO.getExtendLevel();
        styleDim.extendType=styleDimVO.getExtendType();
        styleDim.firstDimValue=styleDimVO.getFirstDimValue();
        styleDim.formName=styleDimVO.getFormName();
        styleDim.id=styleDimVO.getId();
        styleDim.parentId=styleDimVO.getParentId();
        styleDim.secondDimValue=styleDimVO.getSecondDimValue();
        styleDim.styleId=styleDimVO.getStyleId();
        return customService.saveDim(styleDim);
    }
*/
    /**
     * 删除扩展表单
     * @param id
     * @return
     */
    public boolean deleteDim(String id)
    {
        return customService.deleteDim(id);
    }

    public Map<String,Object> getFirstDimInfoList(String  ywlxId)
    {
        StyleCustom styleCustom=getCustom(ywlxId);
        if(styleCustom==null)
        {
            throw new RuntimeException("error01");
            //业务类型ID不正确 或者未启用运行时
        }
        String firstDim=styleCustom.firstDim;
        ClassType classTypeInfo=getClassType(firstDim);
        Map<String,Object>backInfo=new HashMap<>();
        backInfo.put("tableName",classTypeInfo.tableName);
        backInfo.put("text",classTypeInfo.textField);
        backInfo.put("value",classTypeInfo.valueField);
        return backInfo;
    }


}

