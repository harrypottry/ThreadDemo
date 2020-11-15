package com.test.demo.lesson5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/11/15 0015 下午 18:05
 * @Created by Administrator
 */

public class Test implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }

    static ExecutorService service= Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        for(int i=0;i<100;i++) {
            service.execute(new Test());
        }
        service.shutdown();
    }
}

