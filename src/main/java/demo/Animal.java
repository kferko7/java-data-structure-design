package demo;

/*
Inheritance: when a class is inherited from another class, it inherits
all of the superclass non-private variables and methods.

 */
public class Animal {
    protected int legs;

    public void eat() {
        System.out.println("Animal eats");
    }
}

//dog inherit legs variables from the Animal class
class Dog extends Animal {
    Dog() {
        legs = 4;
    }
}

//dog object is declared and call the eat method of its super class
class MyClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}
