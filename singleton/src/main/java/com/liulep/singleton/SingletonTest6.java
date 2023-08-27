package com.liulep.singleton;

/**
 * 饿汉式，线程安全，使用静态代码块进行创建
 */
public class SingletonTest6 {

    private SingletonTest6(){}

    private static SingletonTest6 instance = null;

    static {
        instance = new SingletonTest6();
    }

    public static SingletonTest6 getInstance(){
        return instance;
    }
}
