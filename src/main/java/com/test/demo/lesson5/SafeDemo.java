package com.test.demo.lesson5;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Classname SafeDemo
 * @Description TODO
 * @Date 2020/11/15 0015 下午 17:44
 * @Created by Administrator
 */
public class SafeDemo {

    private static AtomicInteger count=new AtomicInteger(0);

    public static synchronized void inc() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count.getAndIncrement();
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<1000;i++){
            new Thread(()-> {
                SafeDemo.inc();
            }).start();
        }
        Thread.sleep(4000);
        System.out.println(count.get());
    }
}
