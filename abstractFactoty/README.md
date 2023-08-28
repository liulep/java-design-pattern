## 抽象工厂模式

### 一、概述（百度百科）

![image-20230828232618709](https://images.liulep.com/img/2023/08/28/64ecbc9f24355.png)

### 二、参与者

1. AbstarctFactory声明一个创建抽象产品对象的操作接口
2. ConcreateFactory实现创建具体产品对象的操作
3. AbstarctProduct为一类产品对象声明一个接口
4. ConcreateProduct定义一个将被相应的具体工厂创建的产品对象，实现AbstarctProduct接口
5. Client仅使用由AbstarctFactory和AbstarctProduct类声明的接口

### 三、类图

![image-20230829000332706](https://images.liulep.com/img/2023/08/29/64ecc55936cce.png)

### 四、实践

- 定义抽象工厂类(AbstarctFactory)

  ```java
  /**
   * 定义抽象工厂类
   */
  public interface IAnimalFactory {
  
      //定义ICat接口实例方法
      ICat createCat();
  
      //定义IDog接口实例方法
      IDog createDog();
  
  }
  ```

- 创建抽象工厂的实现类(ConcreateFactory)

  ```java
  //白色动物工厂
  public class WhiteAnimalFactory implements IAnimalFactory{
      @Override
      public ICat createCat() {
          return new WhiteCat();
      }
  
      @Override
      public IDog createDog() {
          return new WhiteDog();
      }
  }
  ```

  ```java
  //黑色动物生产工厂
  public class BlackAnimalFactory implements IAnimalFactory{
      @Override
      public ICat createCat() {
          return new BlackCat();
      }
  
      @Override
      public IDog createDog() {
          return new WhiteDog();
      }
  }
  ```

- 定义抽象工厂中要生产的抽象产品接口(AbstarctProduct)

  ```java
  public interface ICat {
  
      //定义方法
      void eat();
  }
  ```

  ```java
  public interface IDog {
  
      //定义方法
      void eat();
  }
  ```

- 创建产品的实现类(ConcreateProduct)

  ```java
  public class BlackCat implements ICat{
      @Override
      public void eat() {
          System.out.println("This is a black cat is eating.");
      }
  }
  ```

  ```java
  public class BlackDog implements IDog{
      @Override
      public void eat() {
          System.out.println("This is a black dog is eating.");
      }
  }
  ```

  ```java
  public class WhiteCat implements ICat{
      @Override
      public void eat() {
          System.out.println("This is a white cat is eating.");
      }
  }
  ```

  ```java
  public class WhiteDog implements IDog{
      @Override
      public void eat() {
          System.out.println("This is a white dog is eating.");
      }
  }
  ```

- Client

  ```java
  //定义一个测试类
  public class Test {
      public static void main(String[] args) {
          IAnimalFactory whiteAnimal = new WhiteAnimalFactory();
          ICat cat = whiteAnimal.createCat();
          IDog dog = whiteAnimal.createDog();
          System.out.println(cat);
          System.out.println(dog);
          cat.eat();
          dog.eat();
  
          IAnimalFactory blackAnimal = new BlackAnimalFactory();
          ICat cat1 = blackAnimal.createCat();
          IDog dog1 = blackAnimal.createDog();
          System.out.println(cat1);
          System.out.println(dog1);
          cat1.eat();
          dog1.eat();
      }
  }
  ```

  输出结果

  ```
  com.liulep.abstractFactory.WhiteCat@2f92e0f4
  com.liulep.abstractFactory.WhiteDog@28a418fc
  This is a white cat is eating.
  This is a white dog is eating.
  com.liulep.abstractFactory.BlackCat@2ff4acd0
  com.liulep.abstractFactory.BlackDog@54bedef2
  This is a black cat is eating.
  This is a black dog is eating.
  ```

### 五、总结

工厂方式为系统结构提供啦非常灵活强大的动态扩展机制，只需要我们更换一下具体的工厂方法，系统其他地方无需一点变动，就可以将系统功能进行改头换面的变化。