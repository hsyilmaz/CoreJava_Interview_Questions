package ArrayQuestions;

import java.util.*;

public class _06_eliminateDuplicates {
    public static void main(String[] args) {

        //Eliminate duplicate values in an array
        Integer[] x={1, 1, 3, 8, 3, 5, 6, 5, 1, 8, 7};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        List<Integer>AList = new ArrayList<>();
        for(int i=0; i<x.length-1; i++)
                if (x[i]!=x[i+1])
                    AList.add(x[i]);
        System.out.println("AList = " + AList);

        //or

        Set<Integer> st=new HashSet<>();

        for (int i : x) {
            st.add(i);
        }
        System.out.println(st);

        // or

        Arrays.sort(x);
        System.out.println(Arrays.toString(x));

        ArrayList<Integer> list=new ArrayList<>();
        for (int i:x) {
            list.add(i);
        }

        for (int i = 0; i < list.size()-1 ; i++) {
            if (list.get(i) == list.get(i+1))
                list.remove(i);
        }
        System.out.println(list);

        // or
        Integer[] y={1, 1, 3, 8, 3, 5, 6, 5, 1, 8, 7};
        List<Integer>ArList= new ArrayList<>(Arrays.asList(y));
        Collections.sort(ArList);
        System.out.println("ArList = " + ArList);
        for(int t=0; t<ArList.size()-1;t++)
            if(ArList.get(t)== ArList.get(t+1))
                ArList.remove(t);
        
        System.out.println("ArList = " + ArList);




    }
}
