package com.test.demo.lesson2;

/**
 * @Classname Demo
 * @Description TODO
 * @Date 2020/11/7 0007 下午 12:09
 * @Created by Administrator
 */
public class Demo {

    volatile int i;

    public void incr(){
        i++;
    }

    public static void main(String[] args) {
        new Demo().incr();
    }
}
