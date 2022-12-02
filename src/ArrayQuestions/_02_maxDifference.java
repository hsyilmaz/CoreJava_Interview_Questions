package ArrayQuestions;

import static java.lang.Math.abs;

public class _02_maxDifference {
    public static void main(String[] args) {

        // Find the greatest difference between values in an int array

        int[] array={8, 1, 5, 6, 3, 25};

        System.out.println(maxDifference(array));
        System.out.println("MaxDiff(array) = " + MaxDiff(array));

    }
    public static int maxDifference (int[] array) { // this method lacks

        int max=0;
        for (int i = 0; i < array.length-1; i++) {
                if (abs(array[i] - array[i+1]) > max) {
                    max= abs(array[i] - array[i+1]);
            }
        }
        return max;
    }
    public static int MaxDiff(int[]Arr){
        int maximum=0;
        for(int i=0; i<Arr.length; i++)
            for(int k=i+1; k<Arr.length; k++)
            {
                if(abs(Arr[i]-Arr[k])>maximum)
                    maximum=abs(Arr[i]-Arr[k]);
            }
        return maximum;
    }
}
