package com.inspur.gs.fssp.pubjz.common.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 键值转换
 * @author rencongtr
 * since  2019/12/12
 */
public class JZExchangeKey {
    /**
     * 将键值转换为全小写
     * @param orgMap 原始键值
     * @return 转换后键值
     */
    public static Map<String, Object> TransKeyToLowerCase(Map<String, Object> orgMap){
        Map<String, Object> resultMap = new HashMap<>();
        if (orgMap == null || orgMap.isEmpty()) {
            return resultMap;
        }
        Set<String> keySet = orgMap.keySet();
        for (String key : keySet) {
            String newKey = key.toLowerCase();
            resultMap.put(newKey, orgMap.get(key));
        }
        return resultMap;
    }

    /**
     * 将列表中的键值全部转换为小写
     * @param list 原始列表
     * @return 转换后列表
     */
    public static List<Object> TransListToLowerCase(List<Object> list){
        if(list != null && list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Map map = (Map)list.get(i);
                map = TransKeyToLowerCase(map);
                list.set(i, map);
            }
        }
        return list;
    }
}
