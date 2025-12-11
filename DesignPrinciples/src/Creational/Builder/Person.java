package Creational.Builder;

public class Person implements Cloneable{
    String name;
    int age;
    double height;
    double weight;
    int numEyes;
    int numToes;
    int numFingers;
    // imagine daghan nig fields
    // and you have multiple constructors
    // and there are some constructors that dont have every fields
    // yes you can create multiple constructors but when one doesnt have numToes and one doesnt have numEyes
    // the list of parameters is tha same (int, double, double, int, int)
    // that wont work
    // thats where builder comes in


    public Person clone() throws CloneNotSupportedException{
        return (Person) super.clone();

    }
}
