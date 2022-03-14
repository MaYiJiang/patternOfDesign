package com.tang.principle.proxyStatic;

/**
 * ClassName:PersonClient Package:com.tang.principle.proxyStatic @Date:2021/10/25 11:51 @Author:TYH
 */
public class PersonClient {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyOfRent proxyOfRent = new ProxyOfRent();
        proxyOfRent.setRent(host);
        proxyOfRent.rent();
    }
}
