package com.tang.principle.builder;

/** ClassName:Client Package:com.tang.principle.builder @Date:2021/10/19 21:32 @Author:TYH */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new HighBuilder());
        Product product = director.constructProduct();
        System.out.println(product);
        System.out.println("----");
        director.setBuilder(new CommonBuider());
        director.constructProduct();
    }
}
