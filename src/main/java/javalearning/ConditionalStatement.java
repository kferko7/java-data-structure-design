package javalearning;

public class ConditionalStatement {
    public static void main(String[] args) {
        boolean statement1 = 1 == 1;
        boolean statement2 = 1 < 3;


       // if (statement1 && statement2) {
            if (statement1 || statement2) {
            System.out.println("statement is true");
        } else {
            System.out.println("statement is false");
        }
    }
}