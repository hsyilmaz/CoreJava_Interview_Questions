package MathQuestions;

public class _11_sumUpDigits {
    public static void main(String[] args) {

        // Sum up all the digits of a given int value until the total is 1 digit
        int number=18958963;

        int total=0;
        String strNumber=Integer.toString(number);
        //String strNum = ""+number;

        for (int i = 0; i < strNumber.length(); i++)
            total=total+Integer.parseInt(strNumber.substring(i, i+1));
            //total=total+Integer.parseInt(String.valueOf(strNumber.charAt(i)));

        do
        {
           String strTotal=Integer.toString(total);
           total=0;
            for (int i = 0; i < strTotal.length(); i++)
                total=total+Integer.parseInt(strTotal.substring(i, i+1));
                //total=total+Integer.parseInt(String.valueOf(strTotal.charAt(i)));

        } while (total/10 !=0);

        System.out.println(total);


    }
}
