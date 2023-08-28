package com.liulep.abstractFactory;

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
