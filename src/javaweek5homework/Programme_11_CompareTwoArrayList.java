package javaweek5homework;

import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme_11_CompareTwoArrayList {
    public static void compareArrayList(){
        //Creating ArrayList
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        //Creating another ArrayList
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //Compare both ArrayLists
        if (c1.equals(c2)){
            System.out.println("c1 and c2 are equal");
        } else {
            System.out.println("c1 and c2 are not equal");
        }
    }
    public static void main(String[] args) {
        compareArrayList();
    }
}
