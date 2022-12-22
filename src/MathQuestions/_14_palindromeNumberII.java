package MathQuestions;

import java.util.Scanner;

public class _14_palindromeNumberII {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= scan.nextInt();

        int counter=0;
        while(number!=reverseFinder(number))
        { number = number+reverseFinder(number); counter++; }

        System.out.println("counter = " + counter);
        System.out.println("number = " + number);
    }
    public static int reverseFinder(int num){
        int reverse=0;
        while(num>0)
        { reverse=reverse*10+num%10; num/=10;}
        return reverse;
    }
}
