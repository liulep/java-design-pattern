package com.liulep.abstractFactory;

//黑色动物生产工厂
public class BlackAnimalFactory implements IAnimalFactory{
    @Override
    public ICat createCat() {
        return new BlackCat();
    }

    @Override
    public IDog createDog() {
        return new BlackDog();
    }
}
