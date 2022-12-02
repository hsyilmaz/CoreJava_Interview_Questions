package ArrayQuestions;

import java.util.Arrays;

public class _10_containsSameElements {
    public static void main(String[] args) {
        // Check if two arrays contains same elements

        int[] a1 = {1,2,3,2,1};
        int[] a2 = {1,2,3};
        int[] a3 = {1,2,3,4};
        int[] a4 = {4,3,1,2};
        System.out.println(containsSameElement(a1, a2));
        System.out.println(containsSameElement(a3, a4));

    }
    public static boolean containsSameElement(int[] x, int[] y) {

        Arrays.sort(x);
        Arrays.sort(y);
        if (x.length == y.length)
            for (int i = 0; i < x.length; i++)
                if (x[i] == y[i])
                    return true;

        return false;
    }

}
