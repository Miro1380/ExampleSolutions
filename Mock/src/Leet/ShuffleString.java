package Leet;

import java.util.Arrays;
import java.util.StringJoiner;

public class ShuffleString {

    public static void main(String[]args){

        ShuffleString sol = new ShuffleString();
        //Test cases
        String s1 = "codeleet";
        String s2 = "abc";
        String s3 ="aiohn";
        String s4 = "aaiougrt";
        String s5 = "art";

        int[] arr1 = {4,5,6,7,0,2,1,3};
        int[] arr2 = {0,1,2};
        int[] arr3 = {3,1,4,2,0};
        int[] arr4 = {4,0,2,6,7,3,1,5};
        int[] arr5 = {1,0,2};


        sol.restoreString(s1, arr1);
        sol.restoreString(s2, arr2);
        sol.restoreString(s3, arr3);
        sol.restoreString(s4, arr4);
        sol.restoreString(s5, arr5);
    }
    public String restoreString(String s, int[] indices) {
        //char[] c = s.toCharArray();
        char[] restored = new char[indices.length];

        //Go through array and replace string in order
        for(int i = 0 ; i < indices.length; i++){

            int index = indices[i];
            restored[index] = s.charAt(i);
        }

        //System.out.println(Arrays.toString(restored));

        String restoredStr = String.valueOf(restored);

        System.out.println(restoredStr);
        return restoredStr;
    }
}
