package AlgoExpert.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveToEnd {
    public static void main(String[]args){
         int[] a = {2,1,2,2,2,3,4,2};
         List<Integer> list = new ArrayList<>();
         for(int num: a){
             list.add(num);
         }

        int toMove =2;
        moveElementToEnd(list,toMove);

    }
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {

        //Zero case
        if(array.size() == 0){
            return array;
        }

        int lPoint = 0;
        int rPoint = array.size()-1;

        System.out.println("rPoint: "+ rPoint);
        while(lPoint != rPoint){
            int left = array.get(lPoint);
            int right = array.get(rPoint);
            //Check if left is toMove. If right is also toMove then swap. Otherwise move right until not a toMove.
            if(left == toMove ){
                if(right != toMove){
                    Collections.swap(array, lPoint,rPoint);
                }else rPoint--;
            }
            else{
                lPoint++;
            }
        }

        System.out.println(Arrays.toString(array.toArray()));
        return array;
    }
}
