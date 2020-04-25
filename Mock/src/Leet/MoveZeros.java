package Leet;

import java.util.Arrays;

public class MoveZeros {
    public static void main (String[]args){
        MoveZeros sol = new MoveZeros();
        int[] arr1 = {0,1,0,3,12};

        sol.moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public void moveZeroes(int[] nums){
        /*
        Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
        Example:

        Input: [0,1,0,3,12]
        Output: [1,3,12,0,0]
        */
        for(int i=0;i<nums.length-1;i++){

            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
    }
}
