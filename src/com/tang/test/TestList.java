package com.tang.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/** ClassName:TestList Package:com.tang.test @Date:2021/10/24 8:37 @Author:TYH */
public class TestList {
    public static void main(String[] args) {
        List<String> l = Collections.synchronizedList(new ArrayList<>());
        for (int i = 1; i <= 10; i++) {
            new Thread(
                            () -> {
                                l.add(UUID.randomUUID().toString().substring(0, 5));
                                l.forEach(System.out::println);
                                System.out.println("----");
                            },
                            String.valueOf(i))
                    .start();
        }
    }
}
