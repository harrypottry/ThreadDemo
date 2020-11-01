package com.test.demo.atomic;

/**
 * @Classname RequestProcessor
 * @Description TODO
 * @Date 2020/11/1 0001 下午 12:26
 * @Created by Administrator
 */
public class AtomicDemo {
    private static int count=0;

    public static void inc(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<1000;i++){
            new Thread(AtomicDemo::inc).start();
        }
        Thread.sleep(4000);
        System.out.println("y运行结果："+count);
    }
}
