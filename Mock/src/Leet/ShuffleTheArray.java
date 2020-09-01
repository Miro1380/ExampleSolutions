package Leet;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

public class ShuffleTheArray {

    public static void main(String[]args){
        //nums.length == 2n
        int[] arr1 = {2,5,1,3,4,7};
        int[] arr2 = {1,2,3,4,4,3,2,1};
        int[] arr3 = {1,1,2,2};

        ShuffleTheArray sol = new ShuffleTheArray();

        sol.shuffle(arr1,3);
        sol.shuffle(arr2,4);
        sol.shuffle(arr3,2);
    }

    public int[] shuffle(int[] nums, int n){
        int[] shuffled = new int[nums.length];
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0 ; i < n; i++){
            deque.add(nums[i]);
            deque.add(nums[i+n]);
        }


        //Turn Integer[] to int[] -> https://stackoverflow.com/questions/31394715/how-to-convert-integer-to-int-array-in-java
        shuffled = Arrays.stream(deque.toArray(new Integer[0])).mapToInt(i->i).toArray();

        System.out.println(Arrays.toString(shuffled));
        return shuffled;
    }
}
