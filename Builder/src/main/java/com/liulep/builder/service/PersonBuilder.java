package com.liulep.builder.service;

import com.liulep.builder.entity.Person;

/**
 * Builder
 * Person对象的构造接口
 */
public interface PersonBuilder {

    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
