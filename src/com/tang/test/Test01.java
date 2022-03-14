package com.tang.test;

import java.util.ArrayList;
import java.util.List;

/** ClassName:Test01 Package:com.tang.test @Date:2021/10/23 10:59 @Author:TYH */
public class Test01 {
    public static void main(String[] args) {
        String reg = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
        String s = "1062193332@qq.com";
        boolean matches = s.matches(reg);
        System.out.println(matches);
        String[] split = s.split("@");
        for (String s1 : split) {
            System.out.println(s1);
        }
        List<Integer> list = new ArrayList<>();
    }
}
