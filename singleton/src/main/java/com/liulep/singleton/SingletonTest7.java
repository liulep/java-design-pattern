package com.liulep.singleton;

/**
 * 枚举方式进行创建单例对象，也是线程安全的
 */
public class SingletonTest7 {

    public static SingletonTest7 getInstance(){
        return SingletonEnum.SINGLETON.getInstance();
    }

    public enum SingletonEnum {
        SINGLETON;

        private SingletonTest7 instance;

        // JVM保证该方法只被调用一次
        SingletonEnum(){
            instance = new SingletonTest7();
        }

        public  SingletonTest7 getInstance(){
            return instance;
        }
    }
}
