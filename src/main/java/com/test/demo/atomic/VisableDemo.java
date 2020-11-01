package com.test.demo.atomic;

import java.util.concurrent.TimeUnit;

/**
 * @Classname RequestProcessor
 * @Description TODO
 * @Date 2020/11/1 0001 下午 12:26
 * @Created by Administrator
 */
public class VisableDemo {

    private volatile static boolean stop=false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            int i=0;
            while(!stop){
                i++;
            }
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        stop=true;
    }
}
