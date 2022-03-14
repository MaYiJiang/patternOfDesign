package com.tang.principle.bridgePattern.phonePattern;

/**
 * ClassName:client Package:com.tang.principle.bridgePattern.phonePattern @Date:2021/10/22
 * 10:59 @Author:TYH
 */
public class client {
    public static void main(String[] args) {
        Phone phone = new FoldPhone(new Vivo());
        phone.call();
    }
}
