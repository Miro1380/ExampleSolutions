package HackerR;

import java.util.HashMap;
import java.util.Map;

public class SalesMatch {
    public static void main(String[]args){
        //Case 1
        int n = 7;
        int[] arr = {1,2,1,2,1,3,2};
        sockMerchant(n,arr);

        //sockMerchant2(n, arr);
    }

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for(int element : ar){
            if(!map.containsKey(element)){
                map.put(element, map.getOrDefault(element,1));
            }
            else {
                map.remove(element);
                pairs++;
            }
        }
        return pairs;
    }

//    static int sockMerchant2(int n, int[] ar){
//        Map<Integer, Integer> map = new HashMap<>();
//        int totalPairs = 0;
//        for(int i = 0; i < ar.length; i++){
//            if(!map.containsKey(ar[i])){
//                map.put(ar[i], 0);
//            }else if(map.containsKey(ar[i]) && map.get(ar[i]) == 0){
//                map.put(ar[i], map.get(ar[i]) +1);
//                totalPairs++;
//            }
//
//
//        }
//        System.out.println("Total Pairs: " + totalPairs);
//        return totalPairs;
//    }

}
