package com.tang.principle.proxyDynamic;

/** ClassName:Client Package:com.tang.principle.proxyDynamic @Date:2021/10/25 12:08 @Author:TYH */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyProduct proxyProduct = new ProxyProduct();
        proxyProduct.setRent(host);
        Rent proxy = (Rent) proxyProduct.getProxy();
        proxy.rent();
    }
}
