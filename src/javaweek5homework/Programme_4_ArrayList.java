package javaweek5homework;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_ArrayList {
    public static void colours(){
        //ArrayList declaration
        ArrayList<String> colourList = new ArrayList();

        //Adding colors to the ArrayList
        colourList.add("Red");
        colourList.add("Blue");
        colourList.add("Green");
        colourList.add("Orange");
        colourList.add("Yellow");

        //Printing collection(colours) of arraylist
        for (String n: colourList){
            System.out.print(n+ " ");
        }
    }

    public static void main(String[] args) {
        colours();
    }
}
