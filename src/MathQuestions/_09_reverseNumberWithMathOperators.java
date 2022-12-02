package MathQuestions;

public class _09_reverseNumberWithMathOperators {
    public static void main(String[] args) {
        // Reverse a given number with math operators
        int number=56898;
        int reverse=0;

        do {
            reverse=reverse*10+number%10;
            number/=10;
            }
        while(number>0);
        System.out.println("reverse = " + reverse);
    }
}
