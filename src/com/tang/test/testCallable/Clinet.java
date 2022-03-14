package com.tang.test.testCallable;

import java.util.concurrent.FutureTask;

/** ClassName:Clinet Package:com.tang.test.testCallable @Date:2021/10/24 10:45 @Author:TYH */
public class Clinet {
    public static void main(String[] args) {
        MYThread thread = new MYThread();
        FutureTask<Integer> futureTask = new FutureTask<>(thread);
        new Thread(futureTask, "A").start();
        Integer integer = null;
        try {
            integer = futureTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(integer);
            System.out.println(futureTask.isDone());
        }

        new Thread(futureTask, "B").start();
    }
}
