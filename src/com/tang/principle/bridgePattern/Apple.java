package com.tang.principle.bridgePattern;

/** ClassName:Apple Package:com.tang.principle.bridgePattern @Date:2021/10/22 10:16 @Author:TYH */
public class Apple implements Brand {
    @Override
    public void info() {
        System.out.print("苹果牌子");
    }
}
