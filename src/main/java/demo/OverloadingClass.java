package demo;

public class OverloadingClass {
    static double max(double a, double b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(8, 17));
        System.out.println(max(3.14, 7.68));
    }

}

/*
methods have the same name, but different parameters
have a different argument list
and they just differ in type, number
 */