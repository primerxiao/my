package com.primerxiao.my.common.annotation;

import java.lang.annotation.*;

//ElementType.METHOD 在方法上使用
@Target(value = {ElementType.TYPE, ElementType.FIELD})
//范围
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EDCode {

}
