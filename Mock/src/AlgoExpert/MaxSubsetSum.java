package AlgoExpert;

import java.util.Arrays;

public class MaxSubsetSum {
    public static void main(String[]args){
        //33
        int[] case1 ={7,10,12,7,9,14};
        System.out.println(maxSubsetSumNoAdjacent(case1));
        //330
       int[] array = {75,105,120,75,90,135};
       System.out.println(maxSubsetSumNoAdjacent(array));
    }

    public static int maxSubsetSumNoAdjacent(int[] array){

        //Empty array case
        if(array.length == 0){
            return 0;
        }
        //Array contains 1 element
        if(array.length == 1){
            return array[0];
        }
        int[] maxSums = array.clone();
        maxSums[1] = Math.max(array[0],array[1]);
        for(int i = 2 ; i < array.length;i++){
            int i1  = maxSums[i-1];
            int i2 = maxSums[i-2];
            int val = array[i];
            maxSums[i] = Math.max(i1,i2+val);
        }
        System.out.println(Arrays.toString(maxSums));
        return maxSums[array.length-1];
    }
}
