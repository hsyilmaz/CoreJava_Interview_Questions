package StringQuestions;

import java.util.Locale;

public class _03_countOfB {
    public static void main(String[] args) {
        // Count how many b letter in a given String
        String s="hajsla hshBvs bAksbJj sbJSBnlBgbfb";
        s=s.toLowerCase();
        int count=0;
        for (int i = 0; i < s.length(); i++)
            if(s.charAt(i)=='b')
                count++;
        System.out.println("count = " + count);

    }

}
