package com.myTang.product;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** ClassName:ProductA Package:com.myTang.product @Date:2021/10/23 21:56 @Author:TYH */

/**
 * 功能描述 指定唤醒方式实现生产者消费者同步问题
 *
 * @author TYH
 * @date 2021/10/26
 * @param * @param null
 * @return
 */
public class ProductA {
    private int num = 0;
    private Lock lock = new ReentrantLock();
    private Condition conditionAdd = lock.newCondition();
    private Condition conditionSub = lock.newCondition();

    public void increment() {
        lock.lock();
        // 判断=>等待=>唤醒
        try {
            while (num == 10) {
                conditionAdd.await();
            }
            num++;
            System.out.println(Thread.currentThread().getName() + "生产了产品" + "当前产品数量为:" + num);
            conditionSub.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void decrement() {
        lock.lock();
        // 判断=>等待=>唤醒
        try {
            while (num == 0) {
                conditionSub.await();
            }
            num--;
            System.out.println(Thread.currentThread().getName() + "消耗了产品" + "当前产品数量为:" + num);
            conditionAdd.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
