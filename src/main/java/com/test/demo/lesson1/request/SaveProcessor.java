package com.test.demo.lesson1.request;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Classname RequestProcessor
 * @Description TODO
 * @Date 2020/11/1 0001 下午 12:26
 * @Created by Administrator
 */
public class SaveProcessor extends Thread implements RequestProcessor{

    LinkedBlockingQueue<Request> linkedBlockingQueue=new LinkedBlockingQueue();

    @Override
    public void run() {
        while(true){
            try {
                Request request=linkedBlockingQueue.take();
                System.out.println("save data:"+request);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void processorRequest(Request request) {
        linkedBlockingQueue.add(request);
    }
}
