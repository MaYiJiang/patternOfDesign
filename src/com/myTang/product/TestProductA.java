package com.myTang.product;

/** ClassName:TestProductA Package:com.myTang.product @Date:2021/10/23 22:11 @Author:TYH */
public class TestProductA {
    public static void main(String[] args) {
        ProductA productA = new ProductA();
        new Thread(
                        () -> {
                            for (int i = 0; i < 100; i++) {
                                // 执行生产方法
                                productA.increment();
                            }
                        },
                        "A")
                .start();
        new Thread(
                        () -> {
                            for (int i = 0; i < 100; i++) {
                                // 执行生产方法
                                productA.increment();
                            }
                        },
                        "C")
                .start();
        new Thread(
                        () -> {
                            for (int i = 0; i < 100; i++) {
                                // 执行生产方法
                                productA.decrement();
                            }
                        },
                        "B")
                .start();
    }
}
