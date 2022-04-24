package javalearning;

public class Review {

    public static void main(String[] args) {
        printS("static method");

        Review myReview = new Review();
        myReview.print("instance method");

    }
    void print(String data) {
        System.out.println(data);
    }

    static void printS(String data) {
        System.out.println(data);
    }
}

//Static method is an instance to a class method
//Non static method is attached to an instance of a class