package MathQuestions;

public class _02_swabbingTwoElements {
    public static void main(String[] args) {
        //Swap the variables with and without using Temp variable

        int x=10;
        int y=19;

        int temp=0;
        temp=x;
        x=y;
        y=temp;

        System.out.println(x + " "+  y);

        x=10;
        y=19;

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println(x + " "+  y);
    }
}
