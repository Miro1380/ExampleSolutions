package Leet;

import java.util.*;

public class TwoSum {
    public static void main (String[]args){
        TwoSum sol = new TwoSum();
        int[] n1 = {2,7,11,15};
        int trgt = 9;

        //[1,2]
        int[] n2 = {3,2,4};
        int t2 = 6;

        //[0,4,3,0]
        //0
        // -> [0,3]
        int[] n3 = {0,4,3,0};
        int t3 = 0;

        //[3,2,4]
        //6
        int[] n4 = {3,2,4};
        int t4 = 6;

        System.out.println(Arrays.toString(sol.twoSum(n1,trgt)));
        //sol.twoSum(n1,trgt);
        sol.twoSum(n2,t2);
        sol.twoSum(n3,t3);
        sol.twoSum(n4,t4);

    }
/*
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer n: nums){
            if(!map.containsKey(n)){
                map.put(n,1);
            }else map.put(n,map.get(n)+1);
        }
        //Iterate and match complement
        // doesn't replace if finds more than 2 ???
        for(int i=0; i < nums.length; i++){

            if(map.containsKey(target - nums[i])){
                System.out.println("Complement found");
                if(list.size() >1 ){
                    list.remove(list.remove(list.size()-2));
                }
                else list.add(i);
            }
        }
        //Follow up on .stream ???? Changes list to array. Prints.
        int[] ndx = list.stream().mapToInt(x->x).toArray();
        for(int j: ndx){
            System.out.println("elem:" + j);
        }

        return ndx;
    }
*/
    public int[] twoSum(int[] nums, int target){
        //Put into a map. <Value, IndexOfV>
        //A Map that has the key of the actual number and the value is Arraylist that stores the indices of the value
        //System.out.println(map.entrySet());
        //Take one value from map. Check if complementary value is in map. ? Target.
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] indices = new int[2];

        for(int i=0; i < nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                indices[0] = map.get(complement);
                indices[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return indices;
    }
}

