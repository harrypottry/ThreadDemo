package com.test.demo.thread;

import java.util.concurrent.TimeUnit;

/**
 * @Classname CallableDemo
 * @Description TODO
 * @Date 2020/11/1 0001 下午 12:20
 * @Created by Administrator
 */
public class ThreadStatusDemo {

    public static void main(String[] args) {
        new Thread(()->{
            while(true){
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"timewaiting").start();

        new Thread(()->{
            while(true){
                synchronized (ThreadStatusDemo.class){
                    try {
                        ThreadStatusDemo.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"waiting").start();

        new Thread(new BlockDemo(),"BlockDemo-0").start();
        new Thread(new BlockDemo(),"BlockDemo-1").start();

    }

    static class BlockDemo extends Thread{
        public void run(){
            synchronized (BlockDemo.class){
                while(true){
                    try {
                        TimeUnit.SECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
