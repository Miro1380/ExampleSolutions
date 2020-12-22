package AlgoExpert;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[]args){
        int[] arr = {8,5,2,9,5,6,3};
        insertionSort(arr);
    }

    public static int[] insertionSort(int[] array) {
        // Write your code here.
        for(int i = 1 ; i < array.length; i++){
            for(int j= i; j > 0  ; j--){
                if((array[j] < array[j-1]))
                    swap(array,j,j-1);
            }
        }
        System.out.println("Insertion Sort: "+ Arrays.toString(array));
        return array;
    }
    public static void swap(int[] arr, int i, int j){
        //System.out.println("Swapping (i,j):"+ arr[indx1] + " , " + arr[indx2]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        //return arr;
    }
}
