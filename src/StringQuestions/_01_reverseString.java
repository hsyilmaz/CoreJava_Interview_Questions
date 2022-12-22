package StringQuestions;

import java.util.Arrays;

public class _01_reverseString {
    public static void main(String[] args) {
        //Reverse a string without using predefined reverse methods

        String s="Hello World";
        String reverse= "";
        String reverse2="";
        for(int i=s.length()-1; i>=0; i--)
            reverse+=s.charAt(i);
            // or [StringBuilder reverse= new StringBuilder();] [reverse.append(s.charAt(i));]
        reverse2=s.substring(s.indexOf(" ")+1)+" "+s.substring(0,s.indexOf(" "));
        System.out.println("reverse = " + reverse);
        System.out.println("reverse2 = " + reverse2);


        String [] array= s.split(" ");
        String [] reverseArray = new String [array.length];
        int j=0;
        for(int i=array.length-1; i>=0; i--)
            reverseArray[j++]=array[i];
        System.out.println("reverse Array = "+Arrays.toString(reverseArray));
    }

}
