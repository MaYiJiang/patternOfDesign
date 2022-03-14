package com.tang.principle.builder;

/** ClassName:HighBuilder Package:com.tang.principle.builder @Date:2021/10/19 21:14 @Author:TYH */
public class HighBuilder extends Builder {
    @Override
    public void buildA() {
        System.out.println("建造高楼的A面");
    }

    @Override
    public void buildC() {
        System.out.println("建造高楼的C面");
    }

    @Override
    public void buildB() {
        System.out.println("建造高楼的B面");
    }
}
