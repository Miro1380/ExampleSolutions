package Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfArrays2 {
    /*
    Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
     */





    public int[] intersect(int[]nums1, int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        //Add initial values to map
        for(int n: nums1){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        //Check that map contains keys with a value > 0
        for(int m: nums2){
            if(map.containsKey(m) && map.get(m) > 0){
                list.add(m);
                map.put(m, map.get(m)-1);
            }
        }

        //Change arrayList to array using list size for array.
        int[] arr = new int[list.size()];
        for(int n= 0;  n<arr.length; n++){
            arr[n]= list.get(n);
        }

        return arr;
    }


    public static void main(String [] args){
        IntersectionOfArrays2 sol = new IntersectionOfArrays2();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] arr = sol.intersect(nums1, nums2);
        System.out.println(Arrays.toString(arr));
        //sol.intrsct(nums1,nums2);
        //sol.intMap(nums1, nums2);


        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};
        //sol.intrsct(nums3,nums4);
        //sol.intMap(nums3, nums4);

        System.out.println(Arrays.toString(sol.intersect(nums3, nums4)));

        int[] num5 = {1, 2};
        int[] num6 = {1, 1};
        //sol.intMap(num5, num6);
        //sol.intrsct(num5, num6);

        System.out.println(Arrays.toString(sol.intersect(num5, num6)));

    }
}
