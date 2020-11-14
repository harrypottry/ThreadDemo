package com.test.demo.lesson4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @Classname ConditionDemoWait
 * @Description TODO
 * @Date 2020/11/14 0014 下午 14:50
 * @Created by Administrator
 */

public class ConditionDemoWait implements  Runnable{
    private Lock lock;
    private Condition condition;

    public ConditionDemoWait(Lock lock, Condition condition){ this.lock=lock;
        this.condition=condition;
    }

    @Override

    public void run() {
        System.out.println("begin -ConditionDemoWait");
        try {
            lock.lock();
            condition.await();
            System.out.println("end - ConditionDemoWait");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
