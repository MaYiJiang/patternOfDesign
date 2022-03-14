package com.tang.test;

import com.tang.test.pojo.User;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** ClassName:testRefalctionSpead Package:com.tang.test @Date:2021/11/1 15:54 @Author:TYH */
public class testRefalctionSpead {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
                    InvocationTargetException {
        test01();
        test02();
        test03();
    }
    // new 方式
    public static void test01() {
        User user = new User("Tang", 16);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            user.getName();
        }
        long end = System.currentTimeMillis();
        System.out.println("new 花费" + (end - start) + "ms");
    }

    // 反射 方式
    public static void test02()
            throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
                    IllegalAccessException {
        User user = new User("Tang", 16);
        Class<?> aClass = Class.forName("com.tang.test.pojo.User");
        Method getName = aClass.getDeclaredMethod("getName", null);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            getName.invoke(user, null);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射 花费" + (end - start) + "ms");
    }

    // 反射关闭检测 方式
    public static void test03()
            throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
                    IllegalAccessException {
        User user = new User("Tang", 16);
        Class<?> aClass = Class.forName("com.tang.test.pojo.User");
        Method getName = aClass.getDeclaredMethod("getName", null);
        getName.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            getName.invoke(user, null);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射关闭检测 花费" + (end - start) + "ms");
    }
}
