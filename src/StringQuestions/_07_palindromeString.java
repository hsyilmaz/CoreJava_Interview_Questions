package StringQuestions;

public class _07_palindromeString {
    public static void main(String[] args) {
        // Write a Java Program to find whether a String is palindrome or not.

        String s="redivider";
        String reverse="";

        for (int i = s.length()-1; i >=0; i--) {
            reverse+=s.charAt(i);
        }
        System.out.println(s.equals(reverse));

//        if (s.equals(reverse)) System.out.println(true);
//        else System.out.println(false);
    }
}
