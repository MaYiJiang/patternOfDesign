package com.tang.principle.bridgePattern;

/** ClassName:Laptop Package:com.tang.principle.bridgePattern @Date:2021/10/22 10:21 @Author:TYH */
public class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("笔记本开机");
    }
}
