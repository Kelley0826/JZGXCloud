package com.inspur.gs.fssp.pubjz.common.utils;
import java.lang.reflect.Method;
import java.util.List;


/**
 * @Author tangchm01
 * @Date 2020/2/20 11:22
 * @Version 1.0
 */
public class JZEntityTransUtils {

    /**
     ×通过常规反射形式
     * DTO对象转换为实体对象。如命名不规范或其他原因导致失败。
     * @param t 源转换的对象
     * @param e 目标转换的对象
     *
     */
    public static <T,E> E transalte(T t,E e){
        Method[] tms=t.getClass().getDeclaredMethods();
        Method[] tes=e.getClass().getDeclaredMethods();
        for(Method m1:tms){
            if(m1.getName().startsWith("get")){
                String mNameSubfix=m1.getName().substring(3);
                String forName="set"+mNameSubfix;
                for(Method m2:tes){
                    if(m2.getName().equals(forName)){
                        // 如果类型一致，或者m2的参数类型是m1的返回类型的父类或接口
                        boolean canContinue = m2.getParameterTypes()[0].isAssignableFrom(m1.getReturnType());
                        if (canContinue) {
                            try {
                                m2.invoke(e, m1.invoke(t));
                                break;
                            } catch (Exception e1) {
                                // TODO Auto-generated catch block
                               // logger.debug("DTO 2 Entity转换失败");
                                e1.printStackTrace();
                            }
                        }
                    }
                }
            }

        }
        return e;
        //logger.debug("转换完成");

    }

    /**
     * dto集合和实体类集合间的互相属性映射
     *
     * @param src
     * @param target
     * @param targetClass
     * @return
     */

    @SuppressWarnings("unchecked")
    public static <S, T> List<T> populateList(List<S> src, List<T> target,
                                              Class<?> targetClass) {

        for (int i = 0; i < src.size(); i++) {

            try {

                Object object = targetClass.newInstance();

                target.add((T) object);

                transalte(src.get(i), object);

            } catch (Exception e) {

                continue;// 某个方法反射异常

            }

        }

        return target;

    }

}
