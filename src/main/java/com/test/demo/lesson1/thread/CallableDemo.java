package com.test.demo.lesson1.thread;

import java.util.concurrent.*;

/**
 * @Classname CallableDemo
 * @Description TODO
 * @Date 2020/11/1 0001 下午 12:20
 * @Created by Administrator
 */
public class CallableDemo implements Callable<String> {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        CallableDemo callableDemo = new CallableDemo();
        Future<String> future = executorService.submit(callableDemo);
        System.out.println(future.get());
        executorService.shutdown();
    }

    @Override
    public String call() throws Exception {
        int a=1;
        int b=2;
        System.out.println(a+b);
        return "执行结果:"+(a+b);
    }
}