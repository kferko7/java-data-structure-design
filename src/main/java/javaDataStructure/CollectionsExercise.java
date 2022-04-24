package javaDataStructure;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CollectionsExercise {
    public void addToEndOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.add(i);
    }
    public void addToStartOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.addFirst(i);
        //then remove i from top --> this woould work as well

    }
    public void removeItemFromTopOfStack(Deque<Integer> stack) {
        stack.pop();

    }
    public void removeItemFromFrontOfQueue(Queue<Integer> queue) {
        queue.poll();

    }
    public void addItemToTreeSet(Set<String> set, String item) {
        set.add(item);
    }

}
/**
 1.When might it be worth using the Stack class instead of the Deque interface to create a stack implementation?
 -when you need to ensure thread safety
 2.What method will you use to add an item to a queue?
 -offer
 3.When might you consider using LinkedList instead of ArrayList?
 -when you will be frequently adding and deleting elements in the list
 Correct:LinkedList provides better performance than ArrayList for inserting and deleting elements.
 4.Which statement about TreeSets is FALSE?
 -TreeSets allow duplicate elements.


 * */
