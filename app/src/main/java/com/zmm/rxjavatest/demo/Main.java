package com.zmm.rxjavatest.demo;

import com.zmm.rxjavatest.demo.observer.LiObserver;
import com.zmm.rxjavatest.demo.observer.WangObserver;
import com.zmm.rxjavatest.demo.observer.ZhangObserver;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/1/23
 * Time:下午5:45
 */

public class Main {

    public static void main(String[] args) {
        TeacherSubject teacherSubject = new TeacherSubject();
        LiObserver liObserver = new LiObserver("李四");
        ZhangObserver zhangObserver = new ZhangObserver("张三");
        WangObserver wangObserver = new WangObserver("王五");

        teacherSubject.attach(liObserver);
        teacherSubject.attach(zhangObserver);
        teacherSubject.attach(wangObserver);

        teacherSubject.change("我在上课");
        teacherSubject.change("快要下课了");
        teacherSubject.change("休息中");

        teacherSubject.detach(zhangObserver);

        teacherSubject.change("准备再次上课");

    }
}
