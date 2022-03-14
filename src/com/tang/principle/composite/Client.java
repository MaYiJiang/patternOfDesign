package com.tang.principle.composite;

/** ClassName:Client Package:com.tang.principle.composite @Date:2021/10/22 18:17 @Author:TYH */
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("江西理工", "垃圾学校");
        OrganizationComponent softCollege = new College("软件学院", "垃圾学院");
        OrganizationComponent createCollege = new College("制造学院", "牛逼学院");
        OrganizationComponent computerDepatement = new Department("软件专业", "垃圾专业");
        OrganizationComponent infoDepatement = new Department("信息专业", "垃圾专业");
        OrganizationComponent machineDepatement = new Department("机械专业", "牛逼专业");
        OrganizationComponent engineerDepatement = new Department("制造专业", "牛逼专业");
        university.add(softCollege);
        university.add(createCollege);
        softCollege.add(computerDepatement);
        softCollege.add(infoDepatement);
        createCollege.add(machineDepatement);
        createCollege.add(engineerDepatement);
        university.print();
        System.out.println("----");
    }
}
