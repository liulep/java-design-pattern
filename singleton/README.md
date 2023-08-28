## 1. 单例模式

**模式介绍**

![image-20230827223556161](https://images.liulep.com/img/2023/08/27/64eb5f5941b18.png)

#### 1.1 懒汉式，线程不安全

```java
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
```

#### 1.2 饿汉式，线程安全

```java
/**
 * 饿汉式，在类进行创建，是线程安全的
 */
public class SingletonTest2 {
    
    private SingletonTest2(){}
    
    private static SingletonTest2 instance = new SingletonTest2();
    
    public static SingletonTest2 getInstance(){
        return instance;
    }
}
```

#### 1.3 懒汉式，线程安全（使用Synchronized）

```java
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
```

### 1.4 懒汉式，线程不安全（使用双重同步锁机制）

```java
**
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
```

#### 1.5 懒汉式，线程安全（使用双重检测机制+volatile）

> volatile可保证对象的可见性与有序性

```java
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
```

#### 1.6 饿汉式，线程安全（使用静态代码块）

```java
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
```

#### 1.7 枚举方式进行实例化，线程安全

```java
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
```