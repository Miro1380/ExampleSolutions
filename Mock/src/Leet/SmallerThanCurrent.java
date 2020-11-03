package Leet;


import java.util.Arrays;
import java.util.HashMap;

public class SmallerThanCurrent {

    //TODO Find a non brute force approach. O(n^2)
    /*
    Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
    That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
    Return the answer in an array.
     */
    public static void main(String[]ars){
        SmallerThanCurrent sol = new SmallerThanCurrent();

        //Case 1 [4,0,1,1,3]
        int[] arr1 = {8,1,2,2,3};

        //Case 2 [2,1,0,3]
        int[] arr2 = {6,5,4,8};

        //Case 3 [0,0,0,0]
        int[] arr3 = {7,7,7,7};

        sol.smallerNumbersThanCurrent(arr1);
        sol.smallerNumbersThanCurrent(arr2);
        sol.smallerNumbersThanCurrent(arr3);
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] values = new int[nums.length];

        for(int i= 0; i < nums.length; i++){
            int lesser = 0;
            int current = nums[i];

            for(int j = 0; j < nums.length; j++){
                if(current != nums[j] && current > nums[j]){
                    lesser++;
                }
            }
            values[i] = lesser;
        }
        System.out.println("Values: " + Arrays.toString(values));

        return values;
    }
        //Approach 1
        //Sort numbers.
        // Start from right to left.
        // if the next number is different and not equal to the current number,
        //count the current position in index and subtract from total and
        //e.g. 8 is at position 4 the next number 3 is less and not equal to 8 then there are zero less than the number 9 since its at the max length index
        //e.g. 3 is at position 3 out of 4. the number 2 is less than it then there are 3 number less than the number 3.
        //e.g. 2 is at position
        // Wont work 7,7,7, will test last 7 see that n-2 is still seven but the remaining n before n-2 are still 7 and its is not less than or equal.

        //Approach 2
        //Put into a map
        //Check values in the map as long as they are not the same and are less add it to that keys, value?? Still needs to 4 loops
        //<Key, Val> ->> <Integer number, number of elements its greater than/ number of elements less than it>
       //Wont work no duplicates allowed.
        //Unless we copy the array for reference. duplicates wont matter?

    public int[] smallerNumbers(int[] nums) {
        int[] values = new int[nums.length];
        HashMap<Integer, Integer> map  = new HashMap<>();
        int[] copyNums = nums.clone();
        Arrays.sort(copyNums);

        for(int index = 0 ; index< nums.length; index++){
            map.putIfAbsent(copyNums[index], index);
        }

        for(int index = 0; index < nums.length; index++){
            copyNums[index] = map.get(nums[index]);
        }

        return values;
    }
}
