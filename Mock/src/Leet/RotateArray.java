package Leet;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[]args){
        RotateArray sol = new RotateArray();
        int[] arr1 = {1,2,3,4,5,6,7};
        sol.rotate(arr1, 3);
        System.out.println(Arrays.toString(arr1));
        //[5,6,7,1,2,3,4];

    }
   /* public void rotate(int[] nums, int k) {
        int index = 1;
        int tail = 0;
        int head = nums[0];
        while(k != 0){
            //Reaches end. Restart index and lower count every traversal ???
            if(index == nums.length-1){
                tail = nums[nums.length-1];
                index = 1;
                k--;
            }else{
                //need temp.Before and after index to move.
                head = nums[index+1];
                nums[index+1] = nums[index];
                System.out.println("Index: "+ index);
                index++;
            }
        }
    } */
//Easier but accepted method ?? O(n) space and time.
    public void rotate(int[] nums, int k) {
        //Create new array the same size as 'nums.'
        int[] rotated = new int[nums.length];

        //Use k as an offset index in empty array. Copy values to new 'index.'
        for(int i=0; i < nums.length; i++){
            int index =  (i+k)%nums.length;
            rotated[index] = nums[i];
        }
        //Copy rotated values to nums.
        for(int i = 0; i < nums.length;i++){
            nums[i] = rotated[i];
        }
    }
}