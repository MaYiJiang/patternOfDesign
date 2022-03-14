package com.tang.principle.bridgePattern;

/**
 * ClassName:Computer Package:com.tang.principle.bridgePattern @Date:2021/10/22 10:18 @Author:TYH
 */
public abstract class Computer {
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void start() {
        brand.info();
    }
}
