package Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Logger l = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        l.append("HI");
        l2.append("HELLO");
        Logger l3 = Logger.getInstance();
        System.out.println(l3.getLog());
    }
}
