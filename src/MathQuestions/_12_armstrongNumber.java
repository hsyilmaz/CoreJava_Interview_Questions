package MathQuestions;

import javax.management.StringValueExp;

public class _12_armstrongNumber {
    public static void main(String[] args) {
        // Write a Java Program to check Armstrong number.

        int number=534494836;

        int temp=number;
        int pow = (""+number).length(); // or: int pow= String.valueOf(number).length();
                                        //     int pow=Integer.toString(number).length();
        int total=0;

        while(temp!=0)
        {
            total+=(int) Math.pow(temp%10,pow);
            temp/=10;
        }

        System.out.println(total == number);
//                  or:
//        if (number == total) System.out.println(true);
//        else System.out.println(false);

    }
}
