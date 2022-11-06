package ArrayQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class _09_StringArrayReverse {
    public static void main(String[] args) {
        //Reverse a given string array

        String [] s={"exiting", "quite", "is", "Java", "Learning"};
        LinkedHashSet<String> set=new LinkedHashSet<>();
        for (int i = s.length-1; i >=0 ; i--) {
            set.add(s[i]);
        }
        String[] reverse=set.toArray(new String[0]);
        System.out.println(Arrays.toString(reverse));

    }
}
