package com.liulep.factoryMethod.service.impl;

import com.liulep.factoryMethod.service.IWorkFactory;
import com.liulep.factoryMethod.service.Work;

public class StudentWorkFactory implements IWorkFactory {
    @Override
    public Work getWork() {
        return new StudentWork();
    }
}
