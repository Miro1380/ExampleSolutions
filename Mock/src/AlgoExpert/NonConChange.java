package AlgoExpert;

import java.util.Arrays;

public class NonConChange {

    public static void main(String[]args){
        int[] coins = {5,7,1,1,2,3,22};

    }

    public static int nonConstructibleChange(int[] coins) {
        int change = 0;
        int min = 0;
        Arrays.sort(coins);
        //If given no coins
        if(coins.length == 0){
            return 1;
        }

        for(int i =0 ; i < coins.length; i++){
            if(coins[i] > change +1){
                return change +1;
            }
            change += coins[i];
        }
        return change+1;
    }
}
