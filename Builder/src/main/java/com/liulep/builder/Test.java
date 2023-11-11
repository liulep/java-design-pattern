package com.liulep.builder;

import com.liulep.builder.director.PersonDirector;
import com.liulep.builder.entity.Person;
import com.liulep.builder.service.impl.ManBuilder;

public class Test {

    public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector();
        Person person = personDirector.construcPerson(new ManBuilder());
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
    }
}
