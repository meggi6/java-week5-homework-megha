package javaweek5homework;

import java.util.HashSet;

/**
 *  Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 *  Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class Programme_8_HashSet {
    public static void hashSet(){
        //Creating HashSet and storing integer objects
        HashSet<Integer> hs= new HashSet<>();
        hs.add(4);
        hs.add(7);
        hs.add(8);

        System.out.println("Numbers in the set between 1 and 10: ");
        // Check which numbers between 1 and 10 are in the set
        for (int i = 1; i <=10; i++) {
            if (hs.contains(i)){
                System.out.println(i+ " is in the hashset ");
            } else {
                System.out.println(i+ " is not in the hashset");
            }
        }
    }

    public static void main(String[] args) {
        hashSet();
    }
}
