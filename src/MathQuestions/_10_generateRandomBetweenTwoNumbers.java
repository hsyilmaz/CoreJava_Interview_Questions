package MathQuestions;

import java.util.Random;

public class _10_generateRandomBetweenTwoNumbers {
    public static void main(String[] args) {
        //Generate a random number between a min and max value;
        int min=5;
        int max=50;
           int random=(int) (Math.random() * (max - min) +5);
        System.out.println(random);
        
    }

}
