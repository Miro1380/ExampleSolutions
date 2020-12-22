package AlgoExpert;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args){
        int[] array = {8,5,2,9,5,6,3};

        selectionSort(array);
    }

    public static int[] selectionSort(int[] array) {

        for(int i=0; i < array.length; i++){
            int min = array[i];
            int index = i;
            for(int j = i+1; j<array.length; j++){
                if(min > array[j]){
                    min = array [j];
                    index = j;

                }
            }
            System.out.println("i: "+ i);
            //System.out.println("Min and arr[i] after loop: " + min + " , " + array[i]);
            if(min < array[i]){
                swap(array,i,index);
            }
        }

        System.out.println("After Selection sort: "+ Arrays.toString(array));

        return array;
    }
    //Swap based on passed in indexes.
    public static void swap(int[] arr, int i, int j){
        System.out.println("Swapping (i,j):"+ arr[i] + " , " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
