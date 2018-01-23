package com.zmm.rxjavatest.demo.observer;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/1/23
 * Time:下午5:42
 */

public class WangObserver implements Observer {

    private String name;

    public WangObserver(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(String s) {
        System.out.println(name+" 收到消息: "+s);
    }
}
