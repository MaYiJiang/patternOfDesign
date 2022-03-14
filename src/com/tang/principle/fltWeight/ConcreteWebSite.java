package com.tang.principle.fltWeight;

/**
 * ClassName:ConcreteWebSite Package:com.tang.principle.fltWeight @Date:2021/10/24 16:22 @Author:TYH
 */
public class ConcreteWebSite extends WebSite {
    private User user;
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    void use(User user) {
        System.out.println("登录网站" + type + user);
    }
}
