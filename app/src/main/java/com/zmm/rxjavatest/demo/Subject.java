package com.zmm.rxjavatest.demo;

import com.zmm.rxjavatest.demo.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/1/23
 * Time:下午5:39
 */

public abstract class Subject {

    private List<Observer> mObservers;


    public void notifyObservers(String s){
        for (Observer observer:mObservers) {
            observer.update(s);
        }
    }

    public void attach(Observer observer){

        if(mObservers == null){
            mObservers = new ArrayList<>();
        }
        mObservers.add(observer);
        System.out.println("加入一个学生 名字是："+observer.getName());
    }

    public void detach(Observer observer){
        mObservers.remove(observer);
        System.out.println("离开一个学生 名字是："+observer.getName());
    }
}
