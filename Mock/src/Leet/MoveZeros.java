package Leet;

import java.util.Arrays;

public class MoveZeros {
    public static void main (String[]args){
        MoveZeros sol = new MoveZeros();
        int[] arr1 = {0,1,0,3,12};
        int[] arr2 = {0,0,1};

        sol.moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1));

        sol.moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public void moveZeroes(int[] nums){
        /*
        Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
        Example:

        Input: [0,1,0,3,12]
        Output: [1,3,12,0,0]

        Have the Zpointer remain while the index goes through the array
        When it finds a non zero and a zero swap the index
        Then set the index to the newly swapped spot of the nonZero
        set I to previous z value ???
        */
        int runner = 0;
        int index = 0;
        while(runner < nums.length){
            //Move pointer if 0
            if(nums[runner] == 0){
                runner++;
            }
            //
            else{
                int temp = nums[runner];
                nums[runner] = nums[index];
                nums[index] = temp;
                runner++;
                index++;
            }
        }
    }
}

