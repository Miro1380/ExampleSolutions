package AlgoExpert;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[]args){
        int[] array = {8,5,2,9,5,6,3};
        bubbleSort(array);
    }
    public static int[] bubbleSort(int[] array) {
        // Write your code here.
        for(int i = 0; i < array.length ; i++){
            for(int j = i+1; j <array.length;j++){
                //Swap
                if(array[j]<array[i]){
                    swap(array,i,j);
                }
            }
        }

        System.out.println("Bubble Sort: "+Arrays.toString(array));
        return array;
    }
    public static int[] swap(int[] arr, int indx1, int indx2){
        //System.out.println("Swapping (i,j):"+ arr[indx1] + " , " + arr[indx2]);
        int temp = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = temp;
        return arr;
    }
}
