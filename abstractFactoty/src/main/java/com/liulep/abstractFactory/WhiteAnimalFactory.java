package com.liulep.abstractFactory;

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
