package com.test.demo.lesson3;

/**
 * @Classname TestThread
 * @Description TODO
 * @Date 2020/11/8 0008 下午 17:27
 * @Created by Administrator
 */
public class TestThread {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadWait threadWait = new ThreadWait(lock);
        threadWait.start();
        ThreadNotify threadNotify = new ThreadNotify(lock);
        threadNotify.start();
    }
}
