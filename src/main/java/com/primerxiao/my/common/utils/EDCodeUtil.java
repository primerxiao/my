package com.primerxiao.my.common.utils;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.primerxiao.my.common.Entity.EntityParent;
import com.primerxiao.my.common.annotation.EDCode;

import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class EDCodeUtil {

    public static final String CHARSET_NAME1 = "gb2312";
    public static final String CHARSET_NAME2 = "latin1";

    /**
     * 将传进来的对象进行编码处理，解决乱码问题
     *
     * @param param 要编码的参数，支持list、set、map、单个对象等。对象要添加注解代表要进行转码
     * @throws UnsupportedEncodingException
     * @throws IllegalAccessException
     */
    public static <T> void setECode(T param) throws UnsupportedEncodingException, IllegalAccessException {
        chekObject(param, CHARSET_NAME1, CHARSET_NAME2);
    }

    /**
     * 将传进来的对象进行解码处理，解决乱码问题
     *
     * @param param
     * @throws UnsupportedEncodingException
     * @throws IllegalAccessException
     */
    public static <T> void setDCode(T param) throws UnsupportedEncodingException, IllegalAccessException {
        chekObject(param, CHARSET_NAME2, CHARSET_NAME1);
    }

    /**
     * 对字符串进行转码
     *
     * @param s
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String setEcode(String s) throws UnsupportedEncodingException {


        return new String(s.getBytes(CHARSET_NAME1), CHARSET_NAME2);
    }

    /**
     * 对字符串进行转码
     *
     * @param s
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String setDcode(String s) throws UnsupportedEncodingException {


        return new String(s.getBytes(CHARSET_NAME2), CHARSET_NAME1);
    }


    private static <T> void chekObject(T param, String charsetName2, String charsetName1) throws IllegalAccessException, UnsupportedEncodingException {
        if (param instanceof Collection) {
            for (T o : (List<T>) param) {
                EDCodeUtil.toCode(o, charsetName2, charsetName1);
            }
        } else if (param instanceof Map) {

            for (T o : ((Map<Object, T>) param).values()) {
                toCode(o, charsetName2, charsetName1);
            }
        } else if (!param.getClass().isPrimitive()) {
            toCode(param, charsetName2, charsetName1);
        } else {
            System.out.println("不支持的转换类型：" + param.getClass().getTypeName());
        }
    }

    private static <T> void toCode(T arg, String charsetName1, String charsetName2) throws IllegalAccessException, UnsupportedEncodingException {
        if (arg.getClass().getDeclaredAnnotation(EDCode.class) != null) {
            Field[] declaredFields = arg.getClass().getDeclaredFields();
            for (Field declaredField : declaredFields) {
                EDCode annotation1 = declaredField.getAnnotation(EDCode.class);
                if (annotation1 != null) {
                    //当前字段需要转码
                    declaredField.setAccessible(true);
                    String value = (String) declaredField.get(arg);
                    if (StrUtil.isNotEmpty(value)) {
                        //将字符进行编码
                        declaredField.set(arg, new String(value.getBytes(charsetName1), charsetName2));
                    }

                }
            }
        }
    }

}
