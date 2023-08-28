package com.liulep.abstractFactory;

/**
 * 定义抽象工厂类
 */
public interface IAnimalFactory {

    //定义ICat接口实例方法
    ICat createCat();

    //定义IDog接口实例方法
    IDog createDog();

}
