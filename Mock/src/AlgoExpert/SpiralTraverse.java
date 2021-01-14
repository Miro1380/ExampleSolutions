package AlgoExpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralTraverse {

    public static void main(String []args){
        int[][] array = {
                {1,2,3,4},
                {12,13,14,5},
                {11,16,15,6},
                {10,9,8,7}
        };

        System.out.println(Arrays.toString(spiralTraverse(array).toArray()));
    }

    public static List<Integer> spiralTraverse(int[][] array){

        ArrayList<Integer> list = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = array.length-1 ;
        int endCol = array[0].length-1;


        while(startRow <= endRow && startCol <= endCol){

            //Add all elements of first row
            for(int col = startCol; col <= endCol; col++){
                list.add(array[startRow][col]);
            }

            //Add all elements for last column of every row.
            for(int row = startRow + 1 ; row <= endRow; row++){
                list.add(array[row][endCol]);
            }

            //Add all elements of last row. Moving right to left.
            for(int col = endCol -1 ; col >= startCol; col--){
                //Avoid adding same value twice
                if(startRow == endRow){
                    break;
                }
                list.add(array[endRow][col]);
            }

            for(int row = endRow - 1; row > startRow ; row--){
                if(startCol == endCol){
                    break;
                }
                list.add(array[row][startCol]);
            }

            //Moves perimeter inward.
            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }
        return list;
    }
}
