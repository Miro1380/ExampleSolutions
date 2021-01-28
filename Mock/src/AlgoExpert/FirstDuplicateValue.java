package AlgoExpert;

import java.util.ArrayList;

public class FirstDuplicateValue {

    public static void main(String[]args){

        int[] arr1 = {2,1,5,2,3,3,4};
        System.out.println(firstDuplicateValue(arr1));
    }

    public static int firstDuplicateValue(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for(Integer val: array){
            if(!list.contains(val)){
                list.add(val);
            }
            else return val;
        }
        return -1;
    }
}
