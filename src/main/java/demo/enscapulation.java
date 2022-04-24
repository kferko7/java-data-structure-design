package demo;

public class enscapulation {
    private double balance=0;
    public void deposit(double x) {
        if(x > 0) {
            balance += x;
        }
        System.out.println("this is enscapulation class");
    }

    /*
    implementation details are not visible to users and hide data.
    Declare the variables as private and provide setters and getters
     */

}
