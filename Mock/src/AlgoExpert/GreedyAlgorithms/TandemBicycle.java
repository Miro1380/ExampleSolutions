package AlgoExpert.GreedyAlgorithms;

import java.util.Arrays;

public class TandemBicycle {
    public static void main(String[] args) {
        int[] reds = {5,5,3,9,2};
        int[] blues = {3,6,7,2,1};
        TandemBicycle test = new TandemBicycle();

        test.tandemBicycle(reds,blues, true);
        test.tandemBicycle(reds,blues, false);
        //tandemBicycle();
    }

    //If fastest is true return max speed. Else, return minimum speed
    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {

        //Sort arrays to get lowest and highest speed riders.
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        //Check if fast is true. If not reverse array to guarantee lower speeds.
        if(!fastest){
           reverseArray(redShirtSpeeds);
        }
        //Add highest of one array to lowest of other array.
        int totalSpeed = 0;
        int left = 0;
        for(int right = blueShirtSpeeds.length-1; right >= 0 ; right--){
            int red = redShirtSpeeds[left];
            int blue = blueShirtSpeeds[right];
            totalSpeed += Math.max(red,blue);
            left++;
        }
        return totalSpeed;
    }

    //https://stackoverflow.com/questions/2137755/how-do-i-reverse-an-int-array-in-java
    //Cant use collections. Doesn't work on primitives.
    private int[] reverseArray(int[] array){
        //Pivot around midpoint.
        for(int i= 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
