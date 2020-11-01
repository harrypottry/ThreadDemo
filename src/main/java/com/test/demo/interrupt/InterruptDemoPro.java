package com.test.demo.interrupt;

import java.util.concurrent.TimeUnit;

/**
 * @Classname InterruptDemoPro
 * @Description TODO
 * @Date 2020/11/1 0001 下午 13:17
 * @Created by Administrator
 */
public class InterruptDemoPro {

    public static void main(String[] args) throws InterruptedException{

        Thread thread = new Thread(()->{
            while(true){
                boolean ii=Thread.currentThread().isInterrupted();
                if(ii){
                    System.out.println("before:"+ii);
                    Thread.interrupted();//对线程进行复位，中断标识为false
                    System.out.println("after:"+Thread.currentThread().isInterrupted());
                }
            }
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();//设置中断标识,中断标识为 true
    }
}
