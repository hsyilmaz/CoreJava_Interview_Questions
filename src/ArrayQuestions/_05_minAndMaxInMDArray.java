package ArrayQuestions;

public class _05_minAndMaxInMDArray {
    public static void main(String[] args) {
        //Find the min and max values in a multidimensional array

        int[][] x={{5, 8, 9}, {18,1, 86}, {56, 3, 200}};
        int min=x[0][0];
        int max=0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j]<min) min=x[i][j];
                if (x[i][j]>max) max=x[i][j];
            }
        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);


        System.out.println("max = "+method(x));
        System.out.println("min = "+method2(x));
    }
    public static int method(int[][]duble){
        int maxx=duble[0][0];
        for(int [] ak :duble)
            for(int a :ak){
                if(a>maxx)
                    maxx=a;
            }
        return maxx;
    }
    public static int method2(int[][]duble) {
        int minn = duble[0][0];
        for (int[] ak : duble)
            for (int a : ak) {
                if (a < minn)
                    minn = a;
            }
        return minn;
    }



}
