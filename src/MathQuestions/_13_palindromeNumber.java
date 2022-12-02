package MathQuestions;

public class _13_palindromeNumber {
    public static void main(String[] args) {
        // Write a Java Program to find whether a number is palindrome or not.

        int number=179626971;
        int reverse=0;
        int temp=number;

        while (temp>0)
        {
            reverse=(reverse*10)+(temp%10);
            temp=temp/10;
        }

        System.out.println(number == reverse);
//                      or:
//        if (number == reverse) System.out.println(true);
//        else System.out.println(false);
    }

}
