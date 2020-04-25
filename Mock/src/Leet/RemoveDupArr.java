package Leet;

public class RemoveDupArr {

    public int removeDuplicates(int[] nums) {
        // start with 0 then compare 0,i if same make 0 jump to 1+i
        int count = 1;
        if(nums.length<1){
            return 0;
        }
        int left = 0;
        for(int right = 1; right< nums.length; right++){
            if(nums[right] != nums[left]){
                left++;
                nums[left] = nums[right];
                count++;

            }
            System.out.println(nums[left]);
        }

        return count;
    }
}
