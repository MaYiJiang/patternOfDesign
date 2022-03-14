package com.tang.principle.bridgePattern.phonePattern;

/**
 * ClassName:FoldPhone Package:com.tang.principle.bridgePattern.phonePattern @Date:2021/10/22
 * 11:02 @Author:TYH
 */
public class FoldPhone extends Phone {
    @Override
    public void call() {
        super.call();
        System.out.println("打电话");
    }

    public FoldPhone(Brand brand) {
        super(brand);
    }
}
