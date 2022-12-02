package ArrayQuestions;

import java.util.Arrays;

public class _04_sortingArray {
    public static void main(String[] args) {
        // sort an array with ascending and descending order

        int[] x={5, 8, 9, 12, 1, 23};
        System.out.println(Arrays.toString(ascending(x)));
        System.out.println(Arrays.toString(descending(x)));

        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
    }

    public static int[] ascending (int[] x) {

        int temp=0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }

       return x;
    }

    public static int[] descending (int[] x) {
        int temp=0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < x.length; j++) {
                if (x[i] < x[j]) {
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }


        return x;
    }
}
