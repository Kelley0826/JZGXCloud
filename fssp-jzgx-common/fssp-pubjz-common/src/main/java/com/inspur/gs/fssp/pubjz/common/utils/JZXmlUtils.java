package com.inspur.gs.fssp.pubjz.common.utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.TimeZone;

/**
 * @author tangchm01
 * @since 1.0.0
 * 读取XML
 */
public class JZXmlUtils {


    private static final DomDriver DOM_DRIVER =
            new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_"));

    private static final DateConverter DATE_CONVERTER =
            new DateConverter("yyyy-MM-dd HH:mm:ss", null, TimeZone.getTimeZone("GMT+8"));
    /**
     *   XML 转实体类 （读取文件地址的方式）
     * @param filePath 文件路径
     * @param clz    目标实体类
     * @param <T>    泛型可以是单实体 也可以是实体集合
     * @return the bean parse from xml
     */
    public static <T> T xmlFile2Bean(String filePath, Class<T> clz) {
        // loading driver
        // xstream也业提供了json的转换驱动，JettisonMappedXmlDriver和JsonHierarchicalStreamDriver。
        XStream xStream = new XStream(DOM_DRIVER);
        // setup security configuration
        // setupDefaultSecurity to be removed after 1.5
        XStream.setupDefaultSecurity(xStream);
        // allow any type from the same package
        xStream.allowTypesByWildcard( new String[] {
                "com.**"});
        // register converter
        xStream.registerConverter(DATE_CONVERTER);
        // processing annotations
        xStream.processAnnotations(clz);
        // processing xml
        T t = (T) xStream.fromXML(new File(filePath));
        return t;
    }
    /**
     *   XML 转实体类 （读取xmlString）
     * @param xmlString
     * @param clz    目标实体类
     * @param <T>    泛型可以是单实体 也可以是实体集合
     * @return the bean parse from xml
     */
    public static <T> T xmlString2Bean(String xmlString, Class<T> clz)
    {
        XStream xStream = new XStream(DOM_DRIVER);
        // setup security configuration
        // setupDefaultSecurity to be removed after 1.5
        XStream.setupDefaultSecurity(xStream);
        // allow any type from the same package
        xStream.allowTypesByWildcard( new String[] {
                "com.**"});
        // register converter
        xStream.registerConverter(DATE_CONVERTER);
        // processing annotations
        xStream.processAnnotations(clz);

        T t = (T) xStream.fromXML(xmlString);
        return t;
    }

    /**
     * return string of obj parsed by xstream.
     * 实体实例转XML  string
     * @param obj
     * @return
     */
    public static String toXmlString(Object obj) {
        XStream xStream = new XStream(DOM_DRIVER);
        // register converter
        xStream.registerConverter(DATE_CONVERTER);
        // processing annotations
        xStream.processAnnotations(obj.getClass());
        return xStream.toXML(obj);
    }

    /**
     * parse obj to xml and write to file.
     *  实体实例 支持输入到指定路径下。
     * @param obj
     * @param filePath 输出路径
     */
    public void outputFile(Object obj, String filePath) throws FileNotFoundException {
        XStream xStream = new XStream(DOM_DRIVER);
        // register converter
        xStream.registerConverter(DATE_CONVERTER);
        // processing annotations
        xStream.processAnnotations(obj.getClass());
        // create target file
        FileOutputStream fileOutputStream = new FileOutputStream(new File(filePath));
        // output
        xStream.toXML(obj, fileOutputStream);
    }
}


