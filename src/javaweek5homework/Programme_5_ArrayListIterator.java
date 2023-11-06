package javaweek5homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using Iterater.
 */

public class Programme_5_ArrayListIterator {
    public static void array() {

        //ArrayList declaration and adding some elements
        ArrayList elements = new ArrayList();
        elements.add("C++");
        elements.add(25);
        elements.add(54.5f);
        elements.add('L');
        elements.add(true);

        //Iterator for iterating all elements of ArrayList one by one
        Iterator iterator = elements.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        array();
    }
}
