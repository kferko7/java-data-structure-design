package demo;

public class OverridenClass {

    public void makeSound() {
        System.out.println("Grr...");
    }
}
class CatTwo extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class ProgramTwo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}

/*
Same return type and arguments
final or static cannot be overriden

 */