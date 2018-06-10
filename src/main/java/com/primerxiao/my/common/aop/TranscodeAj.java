package com.primerxiao.my.common.aop;


import cn.hutool.core.util.StrUtil;

import com.primerxiao.my.common.annotation.EDCode;

import javassist.util.proxy.MethodHandler;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.aop.support.AopUtils;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

@Aspect
@Component
public class TranscodeAj {

    /**
     * 通过切面方式进行字符串编码或者解码
     *
     * @param joinPoint
     */
/*
    @Around("execution(* com.primerxiao.my.backstage.service..*(..))")
*/
    public Object encode(ProceedingJoinPoint joinPoint) throws Throwable {


        Object target = joinPoint.getTarget();
        //开始配置参数
        Object[] args = setECodeParam(joinPoint);
        //配置参数结束

        //开始配置返回值
        //Object proceed = getObject(joinPoint, args);
        //Object proceed = joinPoint.proceed();

       /* System.out.println(proceed instanceof CqAction);
        for (Field field : proceed.getClass().getDeclaredFields()) {
            System.out.println(field.getName());
        }*/
        //配置返回值结束
        return joinPoint.proceed(args);

    }

    /*
        @AfterReturning(value = "execution(* com.primerxiao.my.backstage.service..*(..))",argNames = "joinPoint,retVal",returning = "retVal")
    */
    public void after(JoinPoint joinPoint, Object retVal) throws Throwable {
        Object target = joinPoint.getTarget();

        Class declaringType = joinPoint.getSignature().getDeclaringType();

        System.out.println(joinPoint.getArgs()[0].getClass().getSimpleName());


        Field[] declaredFields = joinPoint.getSignature().getDeclaringType().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
        System.out.println(joinPoint.getArgs().length);
        System.out.println(retVal.getClass().getSimpleName());
        System.out.println("afterReturning");

        Field[] declaredFields1 = retVal.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields1) {
            System.out.println(declaredField.getType());
            System.out.println(declaredField.getName());
            System.out.println(declaredField.getAnnotatedType());

        }

        System.out.println(AopUtils.isAopProxy(retVal));
        System.out.println(AopUtils.isCglibProxy(retVal));
        Object singletonTarget = AopProxyUtils.getSingletonTarget(retVal);
        Class<?> aClass = AopProxyUtils.ultimateTargetClass(retVal);
        System.out.println(aClass.getSimpleName());
        Class<?> targetClass = AopUtils.getTargetClass(retVal);
        Field handler = targetClass.getDeclaredField("handler");
        Field pa_filter_signatureram = targetClass.getDeclaredField("_filter_signature");
        javassist.util.proxy.MethodHandler o = (MethodHandler) handler.get(retVal);

        Object o1 = pa_filter_signatureram.get(retVal);
        System.out.println(o1);


    }

    private Object[] setECodeParam(ProceedingJoinPoint joinPoint) throws IllegalAccessException, UnsupportedEncodingException {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {

            if (arg instanceof Collection) {
                //属于list集合
                for (Object o : (List) arg) {
                    toECode(o);
                }

            } else if (arg instanceof Map) {
                //遍历key
                for (Object o : ((Map) arg).keySet()) {
                    toECode(o);
                }
                //遍历values
                for (Object o : ((Map) arg).values()) {
                    toECode(o);
                }
            } else if (!arg.getClass().isPrimitive()) {
                //不为八大基本类型 那么进行判断
                System.out.println("不为八大类型");
                toECode(arg);
            } else if (arg instanceof String) {
                toECode(arg);
            }

        }
        return args;
    }

    private void toECode(Object arg) throws IllegalAccessException, UnsupportedEncodingException {
        Field[] declaredFields = arg.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("toECode:" + declaredField.getName());
            EDCode annotation1 = declaredField.getAnnotation(EDCode.class);
            if (annotation1 != null) {
                //当前字段需要转码
                declaredField.setAccessible(true);
                String value = (String) declaredField.get(arg);
                //将字符进行编码
                declaredField.set(arg, new String(value.getBytes("gb2312"), "latin1"));
            }
        }
    }

    private Object getObject(ProceedingJoinPoint joinPoint, Object[] args) throws Throwable {
        //取得返回的对象
        Object proceed = joinPoint.proceed(args);

        Field[] declaredFields = proceed.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        if (proceed instanceof Collection) {
            System.out.println("属于集合类型");
            //属于list集合
            for (Object o : (List) proceed) {
                setToDcode(o);
            }

        } else if (proceed instanceof Map) {
            System.out.println("属于map集合类型");
            //遍历key
            for (Object o : ((Map) proceed).keySet()) {
                setToDcode(o);
            }
            //遍历values
            for (Object o : ((Map) proceed).values()) {
                setToDcode(o);
            }
        } else if (!proceed.getClass().isPrimitive()) {
            //不为八大基本类型 那么进行判断
            System.out.println(proceed.getClass().getSimpleName());

            setToDcode(proceed);
        }
        return proceed;
    }

    private void setToDcode(Object o) throws IllegalAccessException, UnsupportedEncodingException {
        Field[] declaredFields = o.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
            EDCode declaredAnnotationsByType = declaredField.getAnnotation(EDCode.class);
            if (declaredAnnotationsByType != null) {
                declaredField.setAccessible(true);
                String value = (String) declaredField.get(o);
                //如果值不为空才进行处理
                if (StrUtil.isNotEmpty(value)) {
                    declaredField.set(o, new String(((String) value).getBytes("latin1"), "gb2312"));
                }

            }
        }
    }
}
