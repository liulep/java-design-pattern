package com.liulep.builder.director;

import com.liulep.builder.entity.Person;
import com.liulep.builder.service.PersonBuilder;

/**
 * Director
 * Person的整体构造器
 */
public class PersonDirector {

    public Person construcPerson(PersonBuilder builder){
        builder.buildHead();
        builder.buildBody();
        builder.buildFoot();
        return builder.buildPerson();
    }

}
