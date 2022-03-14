package com.tang.principle.fltWeight;

/** ClassName:client Package:com.tang.principle.fltWeight @Date:2021/10/24 16:32 @Author:TYH */
public class client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        User user1 = new User("Tang", 18);
        User user2 = new User("liu", 1);
        User user3 = new User("zhang", 4);

        WebSite webSite1 = webSiteFactory.getWebSite("bilibili");
        WebSite taoBao = webSiteFactory.getWebSite("TaoBao");

        webSite1.use(user1);
        webSite1.use(user2);
        taoBao.use(user3);

        System.out.println("The Num of the Web:" + webSiteFactory.getNumOfWeb());
    }
}
