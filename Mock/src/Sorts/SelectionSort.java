package Sorts;

import java.util.Arrays;

//N^2/2 time
//N space ??
//sorted array does not improve time.
public class SelectionSort {

    public static void main(String[] args){
        Comparable[] vals = {1,3,0,2,9,7,8,6,5};
        sort(vals);
        System.out.println(Arrays.toString(vals));

    }

    public static void sort(Comparable[]vals){
        int n = vals.length;
        for(int i = 0; i < n ; i++){
            //Set left most val as minimum
            int min = i;
            for(int j = i+1; j < n; j++){
               //If returned is less than 0 then value at i < j
               if(less(vals[j],vals[min])){
                   //set new minimum to the right ( i.e. j)
                   min = j;
               }
            }
            swap(vals, i, min);
        }
    }

    private static void swap(Comparable[] vals, int i, int j){
        Comparable temp = vals[j];
        vals[j] = vals[i];
        vals[i] = temp;
    }

    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }
}
