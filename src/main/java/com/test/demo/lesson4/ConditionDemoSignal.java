package com.test.demo.lesson4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @Classname ConditionDemoSignal
 * @Description TODO
 * @Date 2020/11/14 0014 下午 14:51
 * @Created by Administrator
 */
public class ConditionDemoSignal implements Runnable{

    private Lock lock;

    private Condition condition;

    public ConditionDemoSignal(Lock lock, Condition condition){
        this.lock=lock;
        this.condition=condition;
    }

    @Override

    public void run() {
        System.out.println("begin -ConditionDemoSignal");
        try {
            lock.lock();
            condition.signal();
            System.out.println("end - ConditionDemoSignal");
        }finally {
            lock.unlock();
        }
    }
}