package Leet;

import java.util.Arrays;

public class RunningSumArr {

    public static void main(String[]args){
        RunningSumArr sol = new RunningSumArr();

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,1,1,1,1};
        int[] arr3 = {3,1,2,10,1};

        sol.runningSum(arr1);
        sol.runningSum(arr2);
        sol.runningSum(arr3);

        //Edge cases (single element)
        sol.runningSum(new int[]{1});

        //Ver2
        sol.runningSum2(arr1);

    }
    public int[] runningSum(int[] nums) {

        //Init new array and temp to hold running value
        int[] sums = new int[nums.length];
        int temp = 0;
        for(int i = 0 ; i < nums.length; i++){
            //If at beginning, insert zeroth  value
            if(i == 0){
                sums[i] += nums[i];
            }
            //Else add temp and current value to new array in current position.
            else{
                sums[i] += nums[i]+temp;
            }
            //Temp is always updated since its a running total i.e (n0, (n1)+n0, (n2)+(n1)+n0, ...)
            temp+= nums[i];
        }

        System.out.println("ARR: "+Arrays.toString(sums));
        return sums;
    }

    //Ver2 using previous iteration for temp.
    public int[] runningSum2(int[] nums){
        for(int i=1; i < nums.length;i++){
            nums[i] += nums[i-1];
        }

        System.out.println("ARR2:"+ Arrays.toString(nums));
        return nums;
    }
}
