package com.test.demo.lesson3;

/**
 * @Classname ThreadNotify
 * @Description TODO
 * @Date 2020/11/8 0008 下午 17:25
 * @Created by Administrator
 */
public class ThreadNotify extends Thread{

    private Object lock;

    public ThreadNotify(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println("开始执行 thread notify");
            lock.notify();
            System.out.println("执行结束 thread notify");
        }
    }
}
