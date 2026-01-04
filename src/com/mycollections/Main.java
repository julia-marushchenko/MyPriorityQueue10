/**
 * Java program to use spliterator() method for Queue.
 */

package com.mycollections;

import java.util.*;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating a queue of Student
        Queue<Double> myQueue = new PriorityQueue<>();

        // Adding elements to myQueue
        myQueue.add(3.0);
        myQueue.add(9.1);
        myQueue.add(21.0);
        myQueue.add(0.9);
        myQueue.add(9.3);

        // Creating spliterator
        Spliterator<Double> sp = myQueue.spliterator();

        // Iterate through myQueue
        sp.forEachRemaining((n) -> print(n));

    }

    // Method to print number
    public static void print (Double number) {
        System.out.println(number);
    }

}