package com.tang.principle.bridgePattern.phonePattern;

/**
 * ClassName:Phone Package:com.tang.principle.bridgePattern.phonePattern @Date:2021/10/22
 * 11:01 @Author:TYH
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void call() {
        brand.call();
    }
}
