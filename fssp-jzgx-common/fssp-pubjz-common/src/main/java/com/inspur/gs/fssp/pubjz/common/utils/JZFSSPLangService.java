package com.inspur.gs.fssp.pubjz.common.utils;

import com.inspur.fastdweb.service.LangService;
import com.inspur.gs.fssp.pubjz.common.entity.JZFSSPLangEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;

import javax.annotation.PostConstruct;

@Primary
@Component
public class JZFSSPLangService {

    private JZFSSPLangService() {
    }

    private static JZFSSPLangService m_JZFSSPLangService = null;

    @Autowired
    private LangService langService;

    @PostConstruct
    private void init() {
        m_JZFSSPLangService = this;
    }

    public JZFSSPLangService getInstance() {
        return m_JZFSSPLangService;
    }

    public String getLanguageString(JZFSSPLangEnum langEnum, String key) {
        //计划任务 无session适配
        if(RequestContextHolder.getRequestAttributes()!=null){
            return langService.getLanguageString(langEnum.value, key);
        }else{
            return langService.getLanguageString(langEnum.value, key,"zh-CHS");
        }
    }

}
