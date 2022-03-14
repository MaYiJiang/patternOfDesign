package com.tang.principle.proxyStatic;

/** ClassName:Host Package:com.tang.principle.proxyStatic @Date:2021/10/25 11:50 @Author:TYH */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东出租房");
    }
}
