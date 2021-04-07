package AlgoExpert.Arrays;

import java.util.Arrays;

public class SmallestDifference {

    public static void main(String[]args){
        int[] arrOne = {-1,5,10,20,28,3};
        int[] arrTwo = {26,134,135,15,17};

        System.out.println("Smallest Dif: " +Arrays.toString(smallestDifference(arrOne,arrTwo)));

        int[] vOne = {10, 1000, 9124, 2142, 59, 24, 596, 591, 124, -123};
        int[] vTwo = {-1441, -124, -25, 1014, 1500, 660, 410, 245, 530};

        System.out.println("Smallest Dif: " +Arrays.toString(smallestDifference(vOne,vTwo)));


    }

    public static int[] smallestDifference(int[] arrOne, int[] arrTwo){
        //Use zero position for initial smallest difference ??
        int[] sDifArr = new int[2];
        int sDif = Integer.MAX_VALUE;

        for(int i = 0 ; i < arrOne.length; i++){
            int one = arrOne[i];

            for(int j = 0 ; j < arrTwo.length; j++){
                int two = arrTwo[j];
                int current ;

                System.out.println("One: "+ one + "\t Two: "+ two);
                //Both Neg
                if(two < one){
                    //Make one pos
                    current = one - two;
                    System.out.println("--: "+ current);
                }
                //Both Pos !!!------!!!
                else if(one > 0 && two > 0){
                    //Make one neg

                    current = (one*-1) + two;
                    current = Math.abs(current);
                    System.out.println("++: "+current);
                }
                //One is neg , other pos
                else{
                    current = one+two;
                    current = Math.abs(current);
                    System.out.println("+-: "+current);
                }

                //Finally check if smallest difference
                if(current < sDif && current != 0){
                    sDif = current;
                    sDifArr[0] = one;
                    sDifArr[1] = two;
                }
            }
        }
        return sDifArr;
    }
}
