package MathQuestions;

public class _05_threeDigits {

    public static void main(String[] args) {
        //Find 3 digits number in an array

        int[] a={1, 3123, 5, -3, 13, 101, 50, -131, 6, 191, 311, -500, 6, 19, -3, -5 };

        for(int i=0; i<a.length; i++)
            if(Math.abs(a[i]/100)>=1 && Math.abs(a[i]/100)<=9)
                System.out.println(a[i]);
    }

}
