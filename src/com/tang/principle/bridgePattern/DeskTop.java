package com.tang.principle.bridgePattern;

/** ClassName:DeskTop Package:com.tang.principle.bridgePattern @Date:2021/10/22 10:22 @Author:TYH */
public class DeskTop extends Computer {
    public DeskTop(Brand brand) {
        super(brand);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("台式机开机");
    }
}
