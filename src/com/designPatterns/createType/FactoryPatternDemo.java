package com.designPatterns.createType;


interface Shape{
    void draw();
}

// 创建实现接口的实体类
class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("这是Rectangle");
    }
}

class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("这是Square");
    }
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("这是Circle");
    }
}

class ShapeFactory{
    public Shape getShape(String shapeType){
        if(shapeType == null)
            return null;
        else if(shapeType.equalsIgnoreCase("circle"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("square"))
            return new Square();
        else if(shapeType.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        return null;
    }
}


interface Color {
    void fill();
}

class Red implements Color{
    @Override
    public void fill() {
        System.out.println("this is red");
    }
}

class Green implements Color {
    @Override
    public void fill() {
        System.out.println("this is green");
    }
}

class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("this is blue");
    }
}

class ColorFactory extends AbstracFactory{
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    public Color getColor(String colorType){
        if(colorType == null)
            return null;
        else if(colorType.equalsIgnoreCase("red"))
            return new Red();
        else if(colorType.equalsIgnoreCase("green"))
            return new Green();
        else if(colorType.equalsIgnoreCase("blue"))
            return new Blue();
        return null;
    }
}

abstract class AbstracFactory{
    public abstract Shape getShape(String shapeType);
    public abstract Color getColor(String colorType);
}


class FactoryProducer{
    public AbstracFactory getFactory(String factoryType){
        if(factoryType == null) return null;
        else if(factoryType.equalsIgnoreCase("color"))
            return new ColorFactory();
        return null;
    }
}

public class FactoryPatternDemo {

    // 工厂设计模式
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();

    // 抽象工厂模式
        AbstracFactory factory = new FactoryProducer().getFactory("color");
        Color color = factory.getColor("red");
        color.fill();
    }


}
