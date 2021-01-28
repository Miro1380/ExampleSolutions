package AlgoExpert;

import java.util.Arrays;

public class MinimumWaitTime {

    public static void main(String[]args){
        int[] arr = {3,2,1,2,6};
        System.out.println(minimumWaitingTime(arr));

        int[] case2 = {2,1,1,1};
        System.out.println(minimumWaitingTime(case2));
    }

    public static int minimumWaitingTime(int[] queries) {
        int sum = 0;
        Arrays.sort(queries);
        for(int i = 0; i < queries.length; i++){
            int current = queries[i];
            int unresolved = queries.length - (i+1);
            sum += current * unresolved;
            //System.out.println("Index: "+ i +" Sum: "+sum  );
        }

        return sum;
    }
}
