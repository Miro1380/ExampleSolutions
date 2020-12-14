package AlgoExpert;

public class BinarySearch {
    public static void main(String[]args){
        int[] arr = {0,1,21,33,45,45,61,71,72,73};
        int target = 33;

        System.out.println(binarySearch(arr,target));
    }

    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        int left = 0;
        int right = array.length-1;
        int middle = (left+right)/2;

        while(left <= right){
            //System.out.println(middle);
            middle = (left+right)/2;
            //Target
            if(array[middle] == target){
                return middle;
            }
            //go Right
            if(array[middle] < target){
                left = middle+1;
            }
            //L
            else{
                right = middle-1;
            }
        }
        return -1;
    }
}
