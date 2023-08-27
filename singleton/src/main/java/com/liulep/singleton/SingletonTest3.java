package com.liulep.singleton;

/**
 * 懒汉式创建，在类被第一次使用时进行创建，是线程安全的，但不推荐这样的写法
 */
public class SingletonTest3 {

    private SingletonTest3(){}

    private static SingletonTest3 instance = new SingletonTest3();

    public static synchronized SingletonTest3 getInstance(){
        //在方法上添加了一个class锁
        if(instance == null){
            instance = new SingletonTest3();
        }
        return instance;
    }
}
