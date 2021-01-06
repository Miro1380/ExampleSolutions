package AlgoExpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static void main(String[]args){

        int[] arr = { 12,3,1,2,-6,5,-8,6};
        int target = 0;
        threeNumberSum(arr,target);
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum){

        List<Integer[]> list = new ArrayList<>();
        Arrays.sort(array);

        for(int i = 0 ; i < array.length; i++){
            int lPoint = i+1;
            int rPoint = array.length-1;

            while (lPoint < rPoint){
                int cSum = array[i] + array[lPoint]+ array[rPoint];

                if(targetSum == cSum && lPoint < rPoint){
                    Integer[] vals = {array[i],array[lPoint],array[rPoint]};
                    System.out.println(Arrays.toString(vals));
                    list.add(vals);
                    rPoint--;
                    lPoint++;
                }
                else if(targetSum < cSum){
                    rPoint--;
                }
                else if(targetSum > cSum){
                    lPoint++;
                }
            }
        }
        return list;
    }
}
