package com.tang.test;

/** ClassName:testFinal Package:com.tang.test @Date:2021/10/24 12:45 @Author:TYH */
public class testFinal {
    public static void main(String[] args) {
        int num = 1;
        //
        //        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param
        // + num));
        //        s.convert(2); // 输出结果为 3
        //        num = 5; // Error:(58, 93) java: 从lambda 表达式引用的本地变量必须是最终变量或实际上的最终变量
    }
}
