package com.tang.principle.builder;

/** ClassName:CommonBuider Package:com.tang.principle.builder @Date:2021/10/19 21:14 @Author:TYH */
public class CommonBuider extends Builder {
    @Override
    public void buildA() {
        System.out.println("建造普通房子的A面");
    }

    @Override
    public void buildC() {
        System.out.println("建造普通房子的C面");
    }

    @Override
    public void buildB() {
        System.out.println("建造普通房子的B面");
    }
}
