package Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestCandyCount {
    public static void main(String[]args){
        int[] arr1 = {2,3,5,1,3};
        int extra1 = 3;

        int[] arr2  = {4,2,1,1,2};
        int extra2 = 1;

        int[] arr3 = {12,1,12};
        int extra3 = 10;

        GreatestCandyCount sol = new GreatestCandyCount();

        sol.kidsWithCandies(arr1, extra1);
        sol.kidsWithCandies(arr2, extra2);
        sol.kidsWithCandies(arr3,extra3);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        ArrayList<Boolean> list = new ArrayList<>();

        //Go through array and get max value for candy.
        for(int n: candies){
            if(n >= max){
                max = n;
            }
        }
        //System.out.println("Pre extra max: "+ max);

        //Check if current kid with extra candy would beat the current max.
        for(int n: candies){
            if(n+extraCandies >= max){
                list.add(true);
            }else list.add(false);
        }

        return list;
    }
}
