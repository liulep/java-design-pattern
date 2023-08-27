package com.liulep.singleton;

/**
 * 懒汉式，线程安全（采用双重同步锁+volatile）
 */

public class SingletonTest5 {

    private SingletonTest5(){}

    //使用volatile防止对象初始化时指令重排
    private static volatile SingletonTest5 instance = new SingletonTest5();

    public static SingletonTest5 getInstance(){
        if(instance == null){
            synchronized (SingletonTest5.class){
                if(instance == null){
                    instance = new SingletonTest5();
                }
            }
        }
        return instance;
    }

}
