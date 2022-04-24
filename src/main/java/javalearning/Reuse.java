package javalearning;


//see Myclass
public class Reuse {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.myMethod();
        mc.myInt = 10;

        System.out.println(mc.myInt);
    }
}
