package com.primerxiao.my.common.Entity;

import com.primerxiao.my.common.annotation.EDCode;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;

public class EntityParent {
    public EntityParent toECode() throws IllegalAccessException, UnsupportedEncodingException {
        Field[] declaredFields = this.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            EDCode annotation = declaredField.getAnnotation(EDCode.class);
            if (annotation != null) {
                String value = (String) declaredField.get(this);
                //将中文进行编码
                declaredField.set(this, new String(value.getBytes("gb2312"), "latin1"));

            }
        }
        return this;
    }

    public EntityParent toDCode() throws IllegalAccessException, UnsupportedEncodingException {
        Field[] declaredFields = this.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            EDCode annotation = declaredField.getAnnotation(EDCode.class);
            if (annotation != null) {
                String value = (String) declaredField.get(this);
                //将中文进行解码
                declaredField.set(this, new String(value.getBytes("latin1"), "gb2312"));

            }
        }
        return this;
    }
}
