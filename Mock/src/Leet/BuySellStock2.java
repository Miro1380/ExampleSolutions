package Leet;

public class BuySellStock2 {
    public static void main(String []args){
        BuySellStock2 sol = new BuySellStock2();
        int [] arr1 = {7,1,5,3,6,4};



        System.out.println(sol.maxProfit(arr1));
    }
    //Set traversal between buy and sell values to 0 ???
    //Have ints: buy, sell. sell can have 2 values?? opt1 and opt2? rotate them until highest sell produced?
    public int maxProfit(int[] prices) {
        int buy = 0, sell= 0, temp = prices[0];
        boolean bought = false, sold = false;
        for(int i=1; i <prices.length;i++){
            if(prices[i] < temp){
                temp = prices[i];
                System.out.println("temp: " + temp);
                bought = true;
            }
            if(true){

            }
        }
        return 1;
    }
}
