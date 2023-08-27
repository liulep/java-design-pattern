package com.liulep.singleton;

/**
 * 懒汉式：单例实例在第一次使用时进行创建，这个类是线程不安全的
 */

public class SingletonTest1 {

    private SingletonTest1(){}

    private static SingletonTest1 instance = null;

    public static SingletonTest1 getInstance(){
        //多个线程同时创建时，可能会创建多个对象
        if(instance == null){
            instance = new SingletonTest1();
        }
        return instance;
    }
}
