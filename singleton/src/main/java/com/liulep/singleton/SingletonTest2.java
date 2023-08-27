package com.liulep.singleton;

/**
 * 饿汉式，在类装载时进行创建，是线程安全的
 */
public class SingletonTest2 {

    private SingletonTest2(){}

    private static SingletonTest2 instance = new SingletonTest2();

    public static SingletonTest2 getInstance(){
        return instance;
    }
}
