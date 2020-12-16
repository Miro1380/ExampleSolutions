package AlgoExpert;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeLargestNums {

    public static void main(String[]args){

        //Output: [18, 141, 541]
        int[] arr = {141,1,17,-7,-17,-27,18,541,8,7,7};
        findThreeLargestNumbers(arr);

        int[] ar2 = {55,7,8};
        findThreeLargestNumbers(ar2);

        int[] ar3 = {-1,-2,-3,-7,-17,-27,-18,-541,-8-7,7};
        findThreeLargestNumbers(ar3);

    }
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here
        if(array.length < 3 ){
            System.out.println("Array not larger than 3");
            return null;
        }

        int[] largest = {Integer.MIN_VALUE, Integer.MIN_VALUE,Integer.MIN_VALUE};
        for(int i = 0; i < array.length; i++){
            int temp = 0;
            if(largest[2] < array[i]){
                largest[0] = largest[1];
                largest[1] = largest [2];
                largest[2] = array[i];
            }
            else if(largest[1] < array[i]){
                largest[0] = largest [1];
                largest[1] = array[i];
            }
            else if (largest[0]< array[i]){
                largest[0] = array[i];
            }

        }
        System.out.println(Arrays.toString(largest));
        return largest;
    }
}
