package javaDataStructure;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {

    public static void main(String[] args) {

        /**Double linked:
         * Each element in the list has a reference
         * to the next element and the previous elements*/

        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");
        System.out.println(shoppingList);

        //add one more element
        shoppingList.add(1, "mango");
        System.out.println(shoppingList);

        //remove first element
        shoppingList.removeFirst();
        System.out.println(shoppingList);

        List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList);
        System.out.println(synchronizedShoppingList);
    }
}
