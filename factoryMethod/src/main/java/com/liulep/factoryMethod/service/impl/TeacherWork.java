package com.liulep.factoryMethod.service.impl;

import com.liulep.factoryMethod.service.Work;

/**
 * Work接口的具体实现类
 */
public class TeacherWork implements Work {
    @Override
    public void doWork() {
        System.out.println("老师审批作业！");
    }
}
