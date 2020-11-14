package com.test.demo.lesson4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname AtomicDemo
 * @Description TODO
 * @Date 2020/11/14 0014 上午 10:52
 * @Created by Administrator
 */
public class AtomicDemo {

    private static int count = 0;

    //公平重入锁和非公平重入锁
    static Lock lock = new ReentrantLock();

    public static void inc() {
        //获得锁
        lock.lock();
        try {
            Thread.sleep(1);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        //释放锁
        lock.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 1000;i++){
            new Thread(AtomicDemo::inc).start();
        }
        Thread.sleep(3000);
        System.out.println("result:"+count);
    }
}
