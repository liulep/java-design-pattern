package com.liulep.factoryMethod.service.impl;

import com.liulep.factoryMethod.service.Work;

/**
 * Work接口的具体实现类
 */
public class StudentWork implements Work {
    @Override
    public void doWork() {
        System.out.println("学生完成作业！");
    }
}
