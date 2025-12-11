package Creational.AbstractFactory;

public class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public static class Rectangle extends Shape {
        public Rectangle(String c) {
            super(c);
        }
    }

//    @Override
//    public String toString() {
//        return Shape.getSimpleName()
//    }
}
