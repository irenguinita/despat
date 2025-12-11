package Creational.AbstractFactory;

public class ShapeFactory {
    public static Shape getShape(String s, String c) {
        s = s.toLowerCase();
        switch (s) {
            case "rectangle":
                return new Shape.Rectangle(c);

            default:
                return null;
        }
    }

}
