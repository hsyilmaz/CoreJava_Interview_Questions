package MathQuestions;

import java.util.Scanner;

public class _14_palindromeSpecial {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayı= oku.nextInt();

        int sayac=0;
        while(sayı!=tersBulma(sayı))
        { sayı = sayı+tersBulma(sayı); sayac++; }

        System.out.println("sayac = " + sayac);
        System.out.println("sayı = " + sayı);
    }
    public static int tersBulma(int num){
        int ters=0;
        while(num>0)
        { ters=ters*10+num%10; num/=10;}
        return ters;
    }
}
