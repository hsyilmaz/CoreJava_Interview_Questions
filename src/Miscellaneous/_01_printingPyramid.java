package Miscellaneous;

public class _01_printingPyramid {
    //Print a pyramid just like below:
  //    *
  //    * *
  //    * * *
  //    * * * *
  //    * * * *
  //    * * *
  //    * *
  //    *
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }


        for(int i=4; i>0; i--) {
            for (int y = 0; y < i; y++) {
                System.out.print("*   ");
            }
            System.out.println();
        }

    }
}















