package com.designPatterns.createType;

interface Item{
    public String name();
    public float price();
    public Packing packing();
}

interface Packing{
    public String pack();
}

// 创建实现Packing的实体类，主要有瓶子和纸盒
class Wrapper implements Packing{
    @Override
    public String pack() {
        return "Wrapper";
    }
}

class Bottle implements Packing{
    @Override
    public String pack() {
        return "Bottle";
    }
}

abstract class ColdDrink implements Item{


    @Override
    public abstract float price();

    @Override
    public Packing packing() {
        return new Bottle();
    }
}

abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}

// 创建了Burger和ColdDrink的实体类
class VegBurger extends Burger{
    @Override
    public String name() {
        return "veg burger";
    }

    @Override
    public float price() {
        return 2.5f;
    }
}

class ChickenBurger extends Burger{
    @Override
    public float price() {
        return 3.5f;
    }

    @Override
    public String name() {
        return "ChickenBurger";
    }
}

class Coke extends ColdDrink{
    @Override
    public float price() {
        return 30f;
    }

    @Override
    public String name() {
        return "coke";
    }
}

class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 0.5f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}

public class BuilderPattern {
    // 建造者模式
    public static void main(String[] args) {

    }
}
