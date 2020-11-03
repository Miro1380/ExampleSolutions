package HackerR;

import java.util.Arrays;

public class LeftRotArray {
    /*
    Given an array  of  integers and a number, ,
    perform  left rotations on the array. Return the updated array to be printed as a
    single line of space-separated integers.
     */
    public static void main(String []args){
        int[] arr1 =  {1,2,3,4,5};
        rotLeft(arr1,3);
    }
    static int[] rotLeft(int[] a , int d) {
        //
        int[] arr = new int[a.length];
        for(int i = 0; i <a.length; i++){
            arr[i] = a[(i+d)%a.length];
        }


        System.out.println("Shifted: "+Arrays.toString(arr));
        return  arr;
    }

    private static int[] rotate(int[] arr, int[] copy){
        for (int i = arr.length - 1; i >= 0; i--) {
            //move over 1
            if (i > 0) {
                arr[i - 1] = copy[i];
            } else {
                //if i = -1 e.g. beginning of array
                arr[arr.length - 1] = copy[i];
            }
        }
        return arr;
    }
}
