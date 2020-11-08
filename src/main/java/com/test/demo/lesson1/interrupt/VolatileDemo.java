package com.test.demo.lesson1.interrupt;

/**
 * @Classname VolatileDemo
 * @Description TODO
 * @Date 2020/11/1 0001 下午 13:28
 * @Created by Administrator
 */
public class VolatileDemo {

    private volatile static boolean stop=false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            int i = 0;
            while(!stop){
                i++;
            }
        });
        thread.start();
        System.out.println("begin start thread");
        Thread.sleep(1000);
        stop=true;
    }
}
