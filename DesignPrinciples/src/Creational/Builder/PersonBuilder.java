package Creational.Builder;

// a person builder has the same things
public class PersonBuilder {
    String name;
    int age;
    double height;
    double weight;
    int numEyes;
    int numToes;
    int numFingers;

    //this is the only field na required, it enforces the need for name
    public PersonBuilder(String name) {
        this.name = name;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setHeight(double height) {
        this.height = height;
        return this;
    }

    public PersonBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public PersonBuilder setNumEyes(int numEyes) {
        this.numEyes = numEyes;
        return this;
    }

    public PersonBuilder setNumToes(int numToes) {
        this.numToes = numToes;
        return this;
    }

    public PersonBuilder setNumFingers(int numFingers) {
        this.numFingers = numFingers;
        return this;
    }

//    public Person create() {
////        return new Person(name, age, height, weight, numEyes, numFingers,numToes);
//    }
}
