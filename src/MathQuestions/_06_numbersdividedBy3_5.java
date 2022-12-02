package MathQuestions;

public class _06_numbersdividedBy3_5 {
    public static void main(String[] args) {

        // Find all numbers which can be divided by 3 and 5
        int[] a={1, -3135, 5, -3, 13, 101, 50, -131, 6, 191, 311, 510, 6, 19, -3, -5, 45 };

        for (int i=0; i<a.length; i++)
            if(Math.abs(a[i])%3==0 && Math.abs(a[i])%5==0)
                System.out.println(a[i]);
        }

    }

