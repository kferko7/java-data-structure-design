package javaDataStructure;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {

    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(300);
        treeSet.add(47);
        treeSet.add(5);
        System.out.println(treeSet);
        //Counted as duplicate
        /**treeSet.add(5);
        System.out.println(treeSet);*/

        //treeSet of Strings
        Set<String> wordSet = new TreeSet<>(Comparator.comparing(String::length));
        wordSet.add("tiger");
        wordSet.add("giraffe");
        wordSet.add("bear");
        System.out.println(wordSet);

        /**
         * Counted as duplicate bear and world both have 4 letters*/
        wordSet.add("wolf");
        System.out.println(wordSet);

        /**Remove giraffe from wordSet */
        wordSet.remove("giraffe");
        System.out.println(wordSet);

    }
}
