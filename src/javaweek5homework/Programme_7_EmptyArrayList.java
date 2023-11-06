package javaweek5homework;

import java.util.ArrayList;

/**
 *  Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_EmptyArrayList {
    public static void isEmptyArrayList(){

        //Creating empty ArrayList
        ArrayList<String> arr = new ArrayList();

        //Verifying arraylist is empty or not
        if (arr.isEmpty()){
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }

        //Adding elements to arraylist
        arr.add("b");
        arr.add("c");

        //Verifying arraylist is empty or not
        if (arr.isEmpty()){
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }
    }
    public static void main(String[] args) {

        isEmptyArrayList();
    }
}
