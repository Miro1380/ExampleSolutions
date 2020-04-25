package Leet;
/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

        Note:
        Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
        Example 1:

        Input: [2,2,1]
        Output: 1
        Example 2:

        Input: [4,1,2,1,2]
        Output: 4
*/

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[]args){
        SingleNumber sol = new SingleNumber();

        int[] arr1 = {2,2,1};
        int[] arr2 = {4,1,2,1,2};
        int[] arr3 = {1,1,2};

        sol.singleNumber(arr1);
        sol.singleNumber(arr2);
    }

    //take zero element and check against the rest??
    // check every element that has two instances and only return the element with one instance.
//    public int singleNumber(int[] nums) {
//        int single = nums[0];
//        int[] hits = new int[nums.length];
//        boolean found = false;
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        int ndx0 = 0;
//        int ndx1 = 1;
//        //if even, then check pairs, if odd use middle and check left and right.
//        while(!found){
//            if(ndx1 < nums.length-1){
//                System.out.println("ndx0: "+ndx0+" ndx1: "+ndx1);
//                //if()
//            }else{
//                return nums.length-1;
//            }
//            ndx0+=2;
//            ndx1+=2;
//        }
//
//
//
//
//        return single;
//    }

    public int singleNumber(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        //Add if not in map. else, If exists add 1 to value. or remove from map to balance??
        for(int n: nums){
            if(!map.containsKey(n)){
                map.put(n,1);
               //System.out.println("Added:"+ n);
            }else{
                map.remove(n);
            }
        }
        return map.keySet().stream().findFirst().get();
    }
}
