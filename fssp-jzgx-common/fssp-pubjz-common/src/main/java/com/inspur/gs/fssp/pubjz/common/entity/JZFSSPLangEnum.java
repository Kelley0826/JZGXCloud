package com.inspur.gs.fssp.pubjz.common.entity;

public enum JZFSSPLangEnum {

    //01基础支撑平台下的共享平台语言包

    /*
     *报账设置-后端语言包
     */
    FSROSetBack("17667e40-0177-d98f-0e7b-0990aad77fd7"),

    /*
     *查询类-后端语言包
     */
    FSCXBack("f6018663-2af4-1fa3-e57c-361be93a909f"),


    /*
     *共享设置-后端语言包
     */
    FSSPSetBack("cde8866c-7dea-c150-6ede-26b3771cb25f"),


    /*
     *共享通用-后端语言包
     */
    FSPubBack("67ff20e4-02f6-ea94-ef4b-2c62243b8da9"),


    //网上报账平台报账单据语言包

    /*
     *对公单据-后端语言包
     */
    FSBizBack("8e2bb476-6e5f-dd7b-67ed-537d40aed7ba"),


    /*
     *对私单据-后端语言包
     */
    FSROBack("7234b1fc-b7b9-a6de-3cfd-5d6f54d84f29"),


    //03财务处理平台的语言包
    /*
     *财务处理-后端语言包
     */
    FSCWCLBack("2f9a3b36-8413-cf41-e19f-8509fa2a8021"),


    //共享流程语言包
    /*
     *共享服务平台-后端语言包
     */
    FSPFBackCode("90a37385-233c-dfcd-563e-31cdb5b22d5d"),


    //表单开发平台
    /*
     *表单开发平台后端语言包
     */
    FSFormLanguageBackCode("a8ccb4e9-eaee-1593-aa02-2e5bd46de697"),


    //04运营管理平台
    /*
     *运营管理-后端语言包
     */
    FSYYGLBack("fc01483d-b4ac-baae-2a3b-984102cadd64");

    public final String value;

    private JZFSSPLangEnum(String value ){
        this.value=value;
    }

    public String value(){
        return this.value;
    }
}
