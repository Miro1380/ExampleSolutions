package Leet;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[]args){
        ContainsDuplicate sol = new ContainsDuplicate();

        int[] arr1 = {1,2,3,1};
        int[] arr2 = {1,2,3,4};
        int[] arr3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(sol.containsDuplicate(arr1));
        System.out.println(sol.containsDuplicate(arr2));
        System.out.println(sol.containsDuplicate(arr3));
    }
/*
    Given an array of integers, find if the array contains any duplicates.

    Your function should return true if any value appears at least twice in the array,
    and it should return false if every element is distinct.

    Example 1:

    Input: [1,2,3,1]
    Output: true
    Example 2:

    Input: [1,2,3,4]
    Output: false
    Example 3:

    Input: [1,1,1,3,3,4,3,2,4,2]
    Output: true*/

    public boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();

        for(int n: nums){
            if(!map.containsKey(n)){
                map.put(n, 1);
            }else return true;
        }
        return false;
    }
}
