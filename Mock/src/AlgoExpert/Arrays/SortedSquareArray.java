package AlgoExpert.Arrays;

import java.util.Arrays;

public class SortedSquareArray {

    public static void main(String[] args) {
        SortedSquareArray test = new SortedSquareArray();


        System.out.println(Arrays.toString(test.sortedSquaredArray(new int[]{1,2,3,5,6,8,9})));
    }

    public int[] sortedSquaredArray(int[] array) {
        //Iterate through array while squaring.
        for(int i =0 ; i < array.length; i++){
            int integer = array[i];
            array[i] *=integer;
        }

        Arrays.sort(array);
        return array;
    }
}
