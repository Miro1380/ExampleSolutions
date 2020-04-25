package Leet;

import java.util.Arrays;

public class PlusOne {
//    Input: [1,2,3]
//    Output: [1,2,4]
//    Explanation: The array represents the integer 123.


//    Example 2
//    Input: [4,3,2,1]
//    Output: [4,3,2,2]
//    Explanation: The array represents the integer 4321.

//    Example 3
    //Input: [9]
    //Output: [1,0]

    //Ex4
    //-> [8,9,9,9]
    //<- [9,0,0,0]
    //mine -> [9,10,10,10]

    //Start from the right side, if the digit is greater than 9 then carry a one;
    //what happens if leftmost digit is > 9? new element??? create a new array with +1 size??
    //if the rightmost is not >9 then add one and return. if it is skip to other if.
    // number greater than 9 then add remainder and carry ???
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){

            //Ends if last element wont change outcome.
            if(digits[i]<9){
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return digits;
            }

            //add 1 to element that is => 9
            digits[i] ++;
            if(digits[i] == 10 && i == 0){
                int[] resize = new int[digits.length+1];
                resize[0] = 1;
                resize[1] = 0;
                System.out.println(Arrays.toString(resize));
                return resize;
            }
            //element is greater than 9 (i.e. 10)
            else{
                if(digits[i]>9){
                    digits[i] = 0;
                }
            }
        }
        return digits;
    }

    public static void main(String[]args){
        PlusOne sol = new PlusOne();

        int[] arr1 = {4,3,2,1};
        int[] arr0 = {1,2,3};
        int[] arr2 = {9};
        int[] arr3 = {8,9,9,9};
        sol.plusOne(arr1);
        System.out.println();
        sol.plusOne(arr0);
        System.out.println();
        sol.plusOne(arr2);
        System.out.println();
        sol.plusOne(arr3);
    }
}
