package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_arrayQuestion {
    public static void main(String[] args) {
        // compare same indexes of 2 different arrays and create another array for matching values

        int[] x={5, 3, 4, 8, 9, 89};
        int[] y={5, 1, 4, 7, 9, 89};

        System.out.println(Arrays.toString(newArray(x, y)));
        System.out.println(Arrays.toString(matchingVal(x,y)));

    }
    public static int[] matchingVal(int[]x, int[]y){
        int t=0;
        for(int i=0; i<x.length; i++)
            if (x[i]==y[i])
                t++;
        int [] match=new int[t];

        int m_index=0;
        for(int i=0; i<x.length; i++)
            if (x[i]==y[i])
                match[m_index++]=x[i];
        return match;
    }


    public static Object[] newArray(int[] x, int[] y) {

        ArrayList<Integer> newArrayList=new ArrayList<>();

        for (int i = 0; i < x.length; i++) {
            if (x[i] == y[i])
                newArrayList.add(x[i]);
        }

        Object[] newArr= newArrayList.toArray();

        return newArr;
    }
}
/*// 100 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka diziye atayınız.

        int[] dizi=new int[10];

        for(int i=0;i< dizi.length;i++)
            dizi[i]= (int)(Math.random()*100);

        int teklerMiktar=0; // teklerin miktarını buluyoruz.
        for(int i=0;i< dizi.length;i++)
            if (dizi[i]%2==1)
                teklerMiktar++;

        int[] tekler=new int[teklerMiktar];  // teklerin miktarı kadar yeni dizi icin hafizada yer oluşturuldu

        int tekIndex=0; // tekIndex diye ayrı bir ikinci dizi için index takip edildi.
        for(int i=0;i< dizi.length;i++)
            if (dizi[i]%2==1){
                tekler[tekIndex]=dizi[i];
                tekIndex++;
            }

        System.out.println("dizi  ="+Arrays.toString(dizi));
        System.out.println("tekler="+Arrays.toString(tekler));
    }*/
