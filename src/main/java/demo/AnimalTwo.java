package demo;

//Polyfmorphism
public class AnimalTwo {
    public void makeSound() {
        System.out.println("Grr...");
    }
}

class Cat extends AnimalTwo {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class DogTwo extends AnimalTwo {
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Program {
    public static void main(String args[]) {
        AnimalTwo a = new DogTwo();
        AnimalTwo b = new Cat();

        a.makeSound();
        b.makeSound();
    }
}
/*
Having many forms
Dog and cat are classes that extends
Animal Class and each of them make a different sound
 */