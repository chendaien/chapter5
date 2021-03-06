package org.smart4j.chapter5.init;

import org.smart4j.chapter5.helper.*;
import org.smart4j.chapter5.util.ClassUtil;

/**
 * 初始化容器
 */
public final class HelperLoader {

    public static void init(){
        Class<?>[] classArray = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for(Class<?> cls:classArray){
            ClassUtil.loadClass(cls.getName(),true);
        }
    }

}
