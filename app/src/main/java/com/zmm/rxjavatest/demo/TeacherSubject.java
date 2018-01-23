package com.zmm.rxjavatest.demo;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/1/23
 * Time:下午5:43
 */

public class TeacherSubject extends Subject {


    public void change(String s){
        notifyObservers(s);
    }
}
