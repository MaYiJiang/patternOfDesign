package com.tang.test.singleton;

/** ClassName:TestSingleTon Package:com.tang.test.singleton @Date:2022/3/13 10:00 @Author:TYH */
public class TestSingleTon {
    public static void main(String[] args) {
        Student student = new Student();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
            new Thread(student).start();
        }
    }
}

class Student implements Runnable {
    private static Student student = null;

    static {
        student = new Student();
    }

    public Student getDemo() {
        return student;
    }

    @Override
    public void run() {
        getDemo();
    }
}
