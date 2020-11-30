package AlgoExpert;

import java.util.*;

public class TwoNumberSum {
    public static void main(String[]args){
        int[] arr = {3,5,-4,8,11,1,-1,6};
        int[] arr2 = {1,2,4};



        System.out.println(Arrays.toString(twoSet(arr,10)));
        System.out.println(Arrays.toString(twoSet(arr2,10)));
    }
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i <array.length; i++){
            int current = array[i];
            for(int j = i+1;j<array.length;j++){
                int inner = array[j];

                if(current + inner == targetSum){
                    list.add(current);
                    list.add(inner);
                }
            }
        }


        //System.out.println(Arrays.toString(list.toArray()));
        int[] intArray = list.stream().mapToInt((i->i)).toArray();
        return intArray;
    }
    public static int[] twoSet(int[] values, int target){

        Set<Integer> set = new HashSet<>();
        //If the set contains the complement, return it in new array
        for(int num: values){
            int comp = target - num ;
            if(set.contains(comp)){
                return new int[]{comp,num};
            }
            //Else add it to set and keep iterating
            else {
                set.add(num);
            }
        }

        return new int[0];
    }
}
