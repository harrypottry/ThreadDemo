package com.test.demo.lesson4;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Classname LockDemo
 * @Description TODO
 * @Date 2020/11/14 0014 上午 10:53
 * @Created by Administrator
 */
public class LockDemo {

    static Map<String,Object> cacheMap = new HashMap<>();

    /**
     *  重入读写锁
     */
    static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    //读锁
    static Lock read = rwl.readLock();

    //写锁
    static Lock write = rwl.writeLock();

    public static final Object get(String key) {
        System.out.println("开始读数据");
        read.lock();
        try {
            return cacheMap.get(key);
        }finally {
            read.unlock();
        }

    }

    public static final Object put(String key,Object value){
        write.lock();
        System.out.println("开始写数据");
        try{
            return cacheMap.put(key,value);
        }finally {
            write.unlock();
        }
    }
}
