package com.liulep.singleton;

/**
 * 懒汉式（双重同步锁机制）
 * 单例实例在被第一次使用时进行创建，但不是线程安全的
 */
public class SingletonTest4 {

    private SingletonTest4(){}

    private static SingletonTest4 instance = null;

    public static SingletonTest4 getInstance(){
        if(instance == null){
            synchronized (SingletonTest4.class){
                if(instance == null){
                    instance = new SingletonTest4();
                }
            }
        }
        return instance;
        /*
        对象初始化时会有三个步骤，分配对象的内存地址，初始化对象，将对象指向刚分配的地址
        这个过程中会发生指令重排问题，在多线程环境下可能该对象还未初始化就已经被其他线程所使用
         */
    }
}
