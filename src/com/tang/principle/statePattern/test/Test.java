package com.tang.principle.statePattern.test;

import com.tang.principle.statePattern.context.Context;

import java.util.concurrent.TimeUnit;

/**
 * ClassName:Test Package:com.tang.principle.statePattern.test @Date:2021/10/30 20:49 @Author:TYH
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Context context = new Context("张三", 100);
        System.out.println(context.getBalance());
        System.out.println("存100元后--------");
        context.deposit(100);
        System.out.println("取100元后-------");
        context.withDraw(90);

        TimeUnit.SECONDS.sleep(2);
        System.out.println("利息:");
        context.getInterest();
    }
}
