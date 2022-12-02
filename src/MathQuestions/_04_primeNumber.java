package MathQuestions;

public class _04_primeNumber {
    public static void main(String[] args) {
        // print if a given value is prime or not

        int val=31;
        boolean flag=false;

        for (int i = 2; i < val/2; i++) {
            if (val%i == 0) { flag=true; break;}
        }
        if(flag) System.out.println("This is not a prime number");
        else System.out.println("This is a prime number");

                    //or//
        if (primeOrNot(val)) System.out.println("Yes, it is a prime number");
        else System.out.println("No, it is not a prime number");
    }
    public static boolean primeOrNot (int x){
        for (int i=2; i<x/2; i++)
            if (x/i != 0)
                return true;
        return false;
    }
}
