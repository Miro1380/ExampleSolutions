package HackerR;

public class CountingValleys {

    public static void main(String[]args){
        int steps = 8 ;
        String path = "UDDDUDUU" ;

        countingValleys(steps, path);


        int step2 = 12;
        String p2 = "DDUUDDUDUUUD";

        countingValleys(step2,p2);
    }

    public static int countingValleys(int steps, String path) {
        //Start checking where valley begins -> valley begins at D
        //Need to check altitude during descent to make sure when reaching up height is zero
        //Iterate through string until you reach an U.
        //When reaching a U check that current height is zero, you've traversed a valley, add to total count of valleys.

        int valleys = 0;
        int height = 0;
        for(int index = 0 ; index < path.length(); index++){
            //Height used to check height between valley steps, must balance out to zero to reach sea level

            if(path.charAt(index) == 'D' ){
                //belowSeaLevel = true;
                height--;
            }
            if (path.charAt(index) == 'U'){
                height++;
            }

            if(height == 0 && path.charAt(index) == 'U' ){
                valleys++;
            }
        }
        System.out.println("Valleys: "+ valleys);
        return valleys;
    }
}
