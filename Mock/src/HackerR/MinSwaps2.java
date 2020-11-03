package HackerR;
/*
You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates.
You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.
*/
public class MinSwaps2 {
    public static void main(String []args){


        int[] arr1 = {7,1,3,2,4,5,6};
        //minimumSwaps(arr1);
        System.out.println("Number of swaps: "+minimumSwaps(arr1));
    }

    static int minimumSwaps(int[] arr){
        int count = 0;
        for(int i = 0;i< arr.length; ){

            if(arr[i] != i+1){
                //Swap should occur or map to n+1. uses 'swap'
                swap(arr,i);
                count++;
            }
            else {
                i++;
            }
        }
        return count;
    }

    private static void swap(int[] arr, int index) {
        int newIndex = arr[index] - 1;
        int tmp = arr[newIndex];
        arr[newIndex] = arr[index];
        arr[index] = tmp;

    }
}
