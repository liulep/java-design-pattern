package com.liulep.factoryMethod.service.impl;

import com.liulep.factoryMethod.service.IWorkFactory;
import com.liulep.factoryMethod.service.Work;

/**
 * 实现类
 */
public class TeacherWorkFactory implements IWorkFactory {
    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}
