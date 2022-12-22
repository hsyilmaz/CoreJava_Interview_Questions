package StringQuestions;

import java.util.Arrays;
import java.util.List;

public class _02_numberOfVowels_Consonants {
    public static void main(String[] args) {
        // Count number of Vowels & Consonants
        int countVowels=0;
        int countConsonants=0;
        String s="Number of Vowels and Consonants";
        s=s.toLowerCase();
        s=s.replaceAll(" ","");
        //Character [] t= new Character[]{'a', 'e', 'i', 'o', 'u'};List<Character>v = Arrays.asList(t)
        List<Character>v = Arrays.asList('a','e','i','o','u');
        for (int i = 0; i < s.length(); i++)
            if (v.contains(s.charAt(i)))
                countVowels++;
            else countConsonants++;

        System.out.println("countVowels = " + countVowels);
        System.out.println("countConsonants = " + countConsonants);
    }

}
