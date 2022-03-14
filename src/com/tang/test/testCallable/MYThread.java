package com.tang.test.testCallable;

import java.util.concurrent.Callable;

/** ClassName:MYThread Package:com.tang.test.testCallable @Date:2021/10/24 10:44 @Author:TYH */
public class MYThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("call");
        if (1 == 1) throw new UnsupportedOperationException();

        return 1024;
    }
}
