//import java.util.Scanner;
//
//public interface Widget {
//    void draw();
//}
//
//class TextField implements Widget {
//    int width;
//    int height;
//
//    public TextField(int width, int height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    @Override
//    public void draw() {
//
//    }
//}
//
//abstract class Decorator implements Widget {
//    //composition
//    private Widget widget;
//
//    public Decorator(Widget widget) {
//        this.widget = widget;
//    }
//
//    //Delegation
//    public void draw() {
//        widget.draw();
//    }
//}
//
//class BorderDecorator extends Decorator {
//    public BorderDecorator(Widget widget) {
//        super(widget);
//    }
//
//    @Override
//    public void draw() {
//        //Delegate to base class and add extra stuff
//        super.draw();
//        System.out.println("BorderDecorator");
//    }
//}
//
//class ScrollDecorator extends Decorator {
//    public ScrollDecorator(Widget widget) {
//        super(widget);
//    }
//
//    @Override
//    public void draw() {
//        super.draw();
//        //add on implementation of draw
//        System.out.println("ScrollDecorator");
//    }
//}
//
//public class Client {
//    public static void main(String[] args) {
////        Widget widget = new BorderDecorator(new ScrollDecorator(new TextField(80, 24)));
//        Widget widget = new TextField(80, 24);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Wanna border? ");
//        if(sc.nextInt() == 1) {
//            widget = new BorderDecorator(widget);
//        }
//        System.out.println("Wanna scroll? ");
//        if(sc.nextInt() == 1) {
//            widget = new ScrollDecorator(widget);
//        }
//        widget.draw();
//    }
//}
//
//package Decorator;
//
