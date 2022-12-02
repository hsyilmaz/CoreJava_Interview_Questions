package MathQuestions;

public class _01_multiplicationWithoutMultiply {
    public static void main(String[] args) {

        // multiply two numbers without using multiply operator

        System.out.println(multiply(40, 30));
    }
    public static int multiply(int j, int k)
    {
        int total=0;
        for(int i=0; i<j; i++)
            total+=k;
        return total;
    }


}
