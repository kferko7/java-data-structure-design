package javaDataStructure;

import java.util.Arrays;
import java.util.Locale;

public class ArrayExamples {

    public static void main(String[] args) {

        String[] weekdays = new String[7];
        System.out.println("0.I am Array one with null values");
        System.out.println(Arrays.toString(weekdays));

        //Create the Arrays and instantiate the values inside them
        //Method One
        weekdays[0] = "Monday";
        System.out.println("1.I am Array Two instantiated with some values eg Monday");
        System.out.println(Arrays.toString(weekdays));

        //Method 2
        weekdays = new String[]{"Mon", "Tue", "Wed"};
        System.out.println("2.I am Array with first 3 days of the week instantiated");
        System.out.println(Arrays.toString(weekdays));

        //Method 3
        for (String day : weekdays) {
            System.out.println("3.I am Method three for loop");
            System.out.println("Week day: " + day);
        }

        //Method 4 iterate through the Array
        for(int i = 0; i < weekdays.length; i++) {
            weekdays[i] = weekdays[i].toUpperCase();
        }
        System.out.println("4.I am Method four Iterated through Array");
        System.out.println(Arrays.toString(weekdays));
    }
}
