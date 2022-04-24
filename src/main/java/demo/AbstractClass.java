package demo;

abstract class AbstractClass {
    int legs = 0;
    abstract void makeSound();
}

class CatFour extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

