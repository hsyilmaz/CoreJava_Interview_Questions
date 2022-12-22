package StringQuestions;

import java.util.Arrays;

public class _06_countOfCharacters {
    public static void main(String[] args) {
        // Print the count of each character and the character itself in a given String
        String s="agahsaagfhf";
        char[] c=new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            c[i]=s.charAt(i);

        }
        Arrays.sort(c);
        int count=1;
        String print="";

        for (int i = 0; i < c.length-1; i++)
            if (c[i] == c[i+1]) count++;
            else {print=print+c[i]+count; count=1;}

        System.out.println(print);

    }
}
