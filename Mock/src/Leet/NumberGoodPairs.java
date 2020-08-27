package Leet;

import java.util.HashMap;

public class NumberGoodPairs {

    public static void main(String[]args){
        //Expected output pairs: 4 ; 6 ; 0 .
        int[] arr1 = {1,2,3,1,1,3};
        int[] arr2 = {1,1,1,1};
        int[] arr3 = {1,2,3};

        NumberGoodPairs sol = new NumberGoodPairs();

        System.out.println("Test Case 1: "+sol.numIdenticalPairs(arr1));
        System.out.println("Test Case 2: "+sol.numIdenticalPairs(arr2));
        System.out.println("Test Case 3: "+sol.numIdenticalPairs(arr3));
    }

    //Brute force
//    public int numIdenticalPairs(int[] nums){
//        int count = 0;
//        for(int i=0; i <nums.length ; i++){
//            for(int j=i+1; j < nums.length; j++){
//
//                if(nums[i] == nums[j]){
//                    System.out.println("Increment count");
//                    count++;
//                }
//                System.out.println(" i:" + nums[i] + " j: "+ nums[j]);
//            }
//        }
//        return count;
//    }

    public int numIdenticalPairs(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int num : nums){
            if(!map.containsKey(num)){
                //Otherwise add it to map
                map.put(num,1);
            }
            else{
                //If its equal then add to value and increment count
                int value = map.get(num);
                count += value;
                map.put(num, ++value);

            }
        }
        System.out.println(map.entrySet());
        return count;
    }

//    public int numIdenticalPairs(int[] nums) {
//        int ans = 0;
//        int[] count = new int[101];
//        for (int i : nums) {
//            System.out.println(i);
//            ans += count[i]++;
//            System.out.println("Count: "+count[i]);
//            //System.out.println(ans);
//        }
//        return ans;
//    }
}
