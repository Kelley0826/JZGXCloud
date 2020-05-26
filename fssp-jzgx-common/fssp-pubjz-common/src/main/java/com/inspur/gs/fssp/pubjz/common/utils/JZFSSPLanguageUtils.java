package com.inspur.gs.fssp.pubjz.common.utils;

/**
 * @Author tangchm01
 * @Date 2020/3/5 18:00
 * @Version 1.0
 */
public class JZFSSPLanguageUtils {
    public static final JZFSSPLanguageUtils current = new JZFSSPLanguageUtils();

    public String replaceLanguage(String originString) {
        String language = JZFSSPSession.current.getLanguage();
        String replaceInfo = "name_chs";
        switch (language) {
            case "zh-CHS":
                replaceInfo = "name_chs";
                break;
            case "en":
                replaceInfo = "name_en";
                break;
            case "zh_CHT":
                replaceInfo = "name_cht";
                break;
            default:
                replaceInfo = "name_chs";
                break;

        }
        return originString.replace("name$language$",replaceInfo);
    }
}
