package Miscellaneous;

import java.util.HashMap;

public class _02_wordCountWithHashMap {
    public static void main(String[] args) {
        // Write a Java Program to count the number of words in a string using HashMap.

        String s="Learning java is amazing in my opinion";

        String[] array=s.split(" ");

        HashMap<Integer, String> map = new HashMap<>();

        int count=1;
        for (String value : array) map.put(count++, value);
      //for(int i=0; i< array.length; i++) map.put(count++,array[i]);

        System.out.println("map = " + map);

    }

}
