package ArrayQuestions;

import java.util.*;

public class _07_secondSmallestNumber {
    //Find 2nd smallest number
    public static void main(String[] args) {
        int[] a={1, 3123, 5, -3, 13, 101, 50, -131, 6, 191, 311, -500, 6, 19, -3, -5 };
        Arrays.sort(a);
        Set<Integer> s=new LinkedHashSet<>();
        for (int i : a)
            s.add(i);

        Object[] a2=new Object[s.size()];
        s.toArray(a2);
        System.out.println(a2[1]);

        //or, in short:
        Arrays.sort(a);
        System.out.println(a2[1]);

    }

}
