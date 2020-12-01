package AlgoExpert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {

    /*
        {"array": [5, 2, [7, -1], 3, [6, [-13, 8], 4]]}
     */
    public static void main(String[]args){

        List<Object> arr1 = new ArrayList<>();

        List<Object> inner = new ArrayList<>();
        List<Object> inner2 = new ArrayList<>();
        List<Object> inner3 = new ArrayList<>();

        //
        inner.add(-13);
        inner.add(8);

        //
        inner2.add(6);
        inner2.add(inner);
        inner2.add(4);

        //
        inner3.add(7);
        inner3.add(-1);

        //
        arr1.add(5);
        arr1.add(2);
        arr1.add(inner3);
        arr1.add(3);
        arr1.add(inner2);



        //go through array
        //check type is it Integer or Array?
        //Int
        //Array
        //for each array iterate

        System.out.println(productSum(arr1));
    }
    public static int productSum(List<Object> array) {
        return productSumHelper(array,1);
    }

    public static int productSumHelper(List<Object> array, int depth){
        int sum = 0;
        for(Object obj : array){
            if(obj instanceof ArrayList){
                ArrayList<Object> list = (ArrayList<Object>) obj;
                sum+= productSumHelper(list,depth+1);
            }
            else{
                sum+= (Integer) obj;
            }
        }
        return sum * depth;
    }
}
