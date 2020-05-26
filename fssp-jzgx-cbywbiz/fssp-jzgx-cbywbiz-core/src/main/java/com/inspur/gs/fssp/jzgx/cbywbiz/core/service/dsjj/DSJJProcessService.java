package com.inspur.gs.fssp.jzgx.cbywbiz.core.service.dsjj;

import com.inspur.gs.fssp.jzgx.data.repository.pub.PfgeformtypeRepository;
import com.inspur.gs.fssp.jzgx.publogic.common.core.base.BzdProcessService;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPLoggerFactory;
import com.inspur.gs.fssp.jzgx.internal.api.InternalApiJZ;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
//import com.inspur.gs.fssp.jzgx.data.entity.cbyw.BzzxdsjjEntity;
//import com.inspur.gs.fssp.jzgx.data.repository.cbyw.BzzxdsjjRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * 对上计价流程处理
 */

@Service
public class DSJJProcessService extends BzdProcessService {

    private static final JZFSSPLoggerFactory logger = JZFSSPLoggerFactory.getLogger(DSJJProcessService.class);
    @Autowired
    @Qualifier("internalApiJZ")
    private InternalApiJZ internalApiJZ;
//    @Autowired
//    private BzzxdsjjRepository bzzxdsjjRepository;


}
