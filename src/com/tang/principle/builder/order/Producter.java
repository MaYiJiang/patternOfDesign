package com.tang.principle.builder.order;

/**
 * ClassName:Producter Package:com.tang.principle.builder.order @Date:2021/10/19 22:29 @Author:TYH
 */
// 套餐1 : 可更换ABC的内容若不更换则为默认值
public class Producter {
    private String packagesA = "可乐";
    private String packagesB = "薯条";
    private String packagesC = "汉堡";

    public String getPackagesA() {
        return packagesA;
    }

    public void setPackagesA(String packagesA) {
        this.packagesA = packagesA;
    }

    public String getPackagesB() {
        return packagesB;
    }

    public void setPackagesB(String packagesB) {
        this.packagesB = packagesB;
    }

    public String getPackagesC() {
        return packagesC;
    }

    public void setPackagesC(String packagesC) {
        this.packagesC = packagesC;
    }

    @Override
    public String toString() {
        return "Producter{"
                + "packagesA='"
                + packagesA
                + '\''
                + ", packagesB='"
                + packagesB
                + '\''
                + ", packagesC='"
                + packagesC
                + '\''
                + '}';
    }
}
