package javaweek5homework;

import java.util.HashMap;
import java.util.Map;

/**
 *  Create a HashMap object called people that will store String keys and Integer values:
 *  And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
    public static void hashMap(){
        //HashMap declaration
        HashMap<String, Integer> people =new HashMap();
        //Storing key-value pair
        people.put("first", 10);
        people.put("second", 20);
        people.put("third", 20);
        people.put(null, null);


        //Printing objects of people one by one
        for (Map.Entry<String, Integer> randomPairs: people.entrySet()){
            System.out.println(randomPairs.getKey()+" "+randomPairs.getValue());
        }
    }
    public static void main(String[] args) {

        hashMap();
    }
}
