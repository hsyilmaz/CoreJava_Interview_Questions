package MathQuestions;

public class _07_findingFactorial {
    public static void main(String[] args) {
        //Find the factorial of a number
        int number=10;


        int factorial=1;
        for (int i = 1; i <=number; i++)
            factorial=factorial*i;
        System.out.println(factorial);


        //or:
        int fact2=1;
        for(int j=number; j>0; j--)
            fact2*=j;
        System.out.println(fact2);

        //or:
        int fact=1;
        while(number>0)
            fact*=number--;
        System.out.println(fact);

    }
}
