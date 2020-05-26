package com.inspur.gs.fssp.pubjz.common.service;

import com.inspur.fastdweb.mgrcard.EventEx;
import com.inspur.fastdweb.mgrcard.FilterEvent;
import com.inspur.fastdweb.mgrcard.Request;

public interface JZIdpFilterEvent extends FilterEvent {
    @Override
    default void beforeAdd(Request request, EventEx ex) {

    }

    @Override
    default void afterAdd(Request request, EventEx ex) {

    }

    @Override
    default void beforeDelete(Request request, EventEx ex) {

    }

    @Override
    default void afterDelete(Request request, EventEx ex) {

    }

    @Override
    default void beforeUpdate(Request request, EventEx ex) {

    }

    @Override
    default void afterUpdate(Request request, EventEx ex) {

    }

    @Override
    default void afterGet(Request request, EventEx ex) {

    }
}
