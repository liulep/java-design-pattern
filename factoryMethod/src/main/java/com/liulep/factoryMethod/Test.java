package com.liulep.factoryMethod;

import com.liulep.factoryMethod.service.IWorkFactory;
import com.liulep.factoryMethod.service.Work;
import com.liulep.factoryMethod.service.impl.StudentWorkFactory;
import com.liulep.factoryMethod.service.impl.TeacherWorkFactory;

//测试类
public class Test {
    public static void main(String[] args) {
        IWorkFactory stuFactory = new StudentWorkFactory();
        IWorkFactory teaFactory = new TeacherWorkFactory();

        //生成学生类
        Work work = stuFactory.getWork();
        work.doWork();

        //生成老师类
        Work tea = teaFactory.getWork();
        tea.doWork();
    }
}
