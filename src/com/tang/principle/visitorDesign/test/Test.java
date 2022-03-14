package com.tang.principle.visitorDesign.test;

import com.tang.principle.visitorDesign.DataView;
import com.tang.principle.visitorDesign.visitor.impl.Parent;
import com.tang.principle.visitorDesign.visitor.impl.Principal;

/**
 * ClassName:Test Package:com.tang.principle.visitorDesign.test @Date:2021/10/27 18:55 @Author:TYH
 */
public class Test {
    public static void main(String[] args) {
        Principal principal = new Principal();
        Parent parent = new Parent();
        DataView dataView = new DataView();
        System.out.println("校长视角↓");
        dataView.show(principal);
        System.out.println("----------");
        System.out.println("家长视角↓");
        dataView.show(parent);
    }
}
