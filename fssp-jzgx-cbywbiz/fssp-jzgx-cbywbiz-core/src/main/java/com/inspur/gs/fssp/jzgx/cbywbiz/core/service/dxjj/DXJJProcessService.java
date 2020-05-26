package com.inspur.gs.fssp.jzgx.cbywbiz.core.service.dxjj;

import com.inspur.gs.fssp.jzgx.publogic.common.core.base.BzdProcessService;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPLoggerFactory;
import com.inspur.gs.fssp.jzgx.internal.api.InternalApiJZ;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
//import com.inspur.gs.fssp.jzgx.data.repository.cbyw.BzzxdsjjRepository;

import java.util.Map;

/**
 * 对下计价流程处理
 */

@Service
public class DXJJProcessService extends BzdProcessService {

    private static final JZFSSPLoggerFactory logger = JZFSSPLoggerFactory.getLogger(DXJJProcessService.class);
    @Autowired
    @Qualifier("internalApiJZ")
    private InternalApiJZ internalApiJZ;
 //   @Autowired
 //   private BzzxdsjjRepository bzzxdsjjRepository;



}
