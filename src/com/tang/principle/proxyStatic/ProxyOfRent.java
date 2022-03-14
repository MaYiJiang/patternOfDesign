package com.tang.principle.proxyStatic;

/**
 * ClassName:ProxyOfRent Package:com.tang.principle.proxyStatic @Date:2021/10/25 11:50 @Author:TYH
 */
public class ProxyOfRent implements Rent {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    @Override
    public void rent() {
        see();
        rent.rent();
        fare();
    }

    private void see() {
        System.out.println("中介带看房");
    }

    private void fare() {
        System.out.println("中介收费");
    }
}
