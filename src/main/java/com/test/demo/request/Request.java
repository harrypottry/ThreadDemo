package com.test.demo.request;

/**
 * @Classname Request
 * @Description TODO
 * @Date 2020/11/1 0001 下午 12:25
 * @Created by Administrator
 */
public class Request {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                '}';
    }
}

