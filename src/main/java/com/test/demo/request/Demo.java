package com.test.demo.request;

/**
 * @Classname RequestProcessor
 * @Description TODO
 * @Date 2020/11/1 0001 下午 12:26
 * @Created by Administrator
 */
public class Demo {
    PrintProcessor printProcessor;

    public Demo() {
        SaveProcessor saveProcessor = new SaveProcessor();
        saveProcessor.start();
        printProcessor = new PrintProcessor(saveProcessor);
        printProcessor.start();
    }

    public static void main(String[] args) {
        Request request = new Request();
        request.setName("test");
        new Demo().doTest(request);
    }

    public void doTest(Request request){
        printProcessor.processorRequest(request);
    }
}
