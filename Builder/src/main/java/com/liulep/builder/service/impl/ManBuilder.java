package com.liulep.builder.service.impl;

import com.liulep.builder.entity.Man;
import com.liulep.builder.entity.Person;
import com.liulep.builder.service.PersonBuilder;

/**
 * ConcreteBuilder
 */
public class ManBuilder implements PersonBuilder {

    private Person person;

    public ManBuilder(){
        this.person = new Man();
    }
    @Override
    public void buildHead() {
        this.person.setHead("建造小史的头");
    }

    @Override
    public void buildBody() {
        this.person.setBody("建造小史的身体");
    }

    @Override
    public void buildFoot() {
        this.person.setFoot("建造小史的脚");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
