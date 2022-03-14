package com.tang.principle.bridgePattern.phonePattern;

/**
 * ClassName:Vivo Package:com.tang.principle.bridgePattern.phonePattern @Date:2021/10/22
 * 11:00 @Author:TYH
 */
public class Vivo implements Brand {
    @Override
    public void call() {
        System.out.println("vivo");
    }
}
