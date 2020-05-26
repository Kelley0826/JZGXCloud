package com.inspur.gs.fssp.pubjz.common.utils;

import io.iec.edp.caf.common.JSONSerializer;

public class JZFSSPJSONSerializer {
    private JZFSSPJSONSerializer() {
    }

    public static <T> String serialize(T obj) {
        return JSONSerializer.serialize(obj);
    }

    public static <T> T deserialize(String json, Class<T> clazz) {
        return JSONSerializer.deserialize(json, clazz);
    }

    public static <T> T deserialize(String json, Class<?> collectionClazz, Class<?>... elementClazzes) {
        return JSONSerializer.deserialize(json, collectionClazz, elementClazzes);
    }
}
