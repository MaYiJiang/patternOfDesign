package com.tang.principle.volatileTest;

/** ClassName:VolDemo Package:com.tang.principle.volatileTest @Date:2021/10/26 15:11 @Author:TYH */
public class VolDemo {
    private static volatile int num = 0;

    public static void addTest() {
        num++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(
                            () -> {
                                for (int j = 0; j < 1000; j++) {
                                    addTest();
                                }
                            })
                    .start();
        }
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(num);
    }
}
