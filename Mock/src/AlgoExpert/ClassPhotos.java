package AlgoExpert;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassPhotos {
    public static void main(String[]args){
        ArrayList<Integer> redShirts = new ArrayList<>(Arrays.asList(5,8,1,3,4));
        ArrayList<Integer> blueShirts = new ArrayList<>(Arrays.asList(6,9,2,4,5));

        //Blue.Should be in back row.
        classPhotos(redShirts,blueShirts);
    }
    public static boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights){
        //Sort to check heights at zero index.
        redShirtHeights.sort(null);
        blueShirtHeights.sort(null);


        //If red is taller, make it iterable variable counter. Else blue is counter.
        if(redShirtHeights.get(0)> blueShirtHeights.get(0)){
            //Red shirts are taller initially.
            System.out.println("Reds are taller at zero.");
            for(int i = 1; i < redShirtHeights.size(); i++){
                System.out.println("Red  v. Blue: " + redShirtHeights.get(i) + " : "+ blueShirtHeights.get(i));
                if(redShirtHeights.get(i) < blueShirtHeights.get(i)){
                    return  false;
                }
            }

        }else if(blueShirtHeights.get(0)> redShirtHeights.get(0)){
            //Blue shirts are taller
            System.out.println("Blue are taller at zero");
            for(int i =1; i < blueShirtHeights.size(); i++){
                System.out.println("Blue v. Red: " + redShirtHeights.get(i) + " : "+ blueShirtHeights.get(i));
                if(blueShirtHeights.get(i) < redShirtHeights.get(i)){
                    return false;
                }
            }
        }
        else if(blueShirtHeights.get(0) == redShirtHeights.get(0)){return false;}

        return true;
    }
}
