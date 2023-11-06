package javaweek5homework;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Programme_6_GetValueOfArrayList {
    public static void getElement(){
        //ArrayList declaration
        ArrayList<Integer> arr= new ArrayList();
        //Storing integer objects
        arr.add(67);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

        //retrieving elements using index
        System.out.println(arr.get(1));
        System.out.println(arr.get(3));
        System.out.println(arr.get(4));
    }
    public static void main(String[] args) {
        getElement();
    }
}
