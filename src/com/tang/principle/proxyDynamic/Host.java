package com.tang.principle.proxyDynamic;

/** ClassName:Host Package:com.tang.principle.proxyDynamic @Date:2021/10/25 12:01 @Author:TYH */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东出租");
    }
}
