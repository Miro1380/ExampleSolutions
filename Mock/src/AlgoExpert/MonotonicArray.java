package AlgoExpert;

public class MonotonicArray {

    public static void main(String[]args){
        int[] array = {-1,-5,-10,-1100, -1100, -1101, -1102, -9001};
        System.out.println(isMonotonic(array));

        int[] case2 = {1,1,1,2,2,2,5,5,5,10};
        System.out.println(isMonotonic(case2));

        int[] case3 = {1,1,1,1,1,1,1};
        System.out.println(isMonotonic(case3));

        int[] case4 = {1,2};
        System.out.println("Case 4: "+isMonotonic(case4));

        int[] case5 = {};
        System.out.println("Case 5: "+ isMonotonic(case5));
    }
    public static boolean isMonotonic(int[] array) {

        //Single element and zero elements arrays are considered monotonic.
        if(array.length <=2){
            return true;
        }
        else{

            //Set both flags as true
            boolean increasing = true;
            boolean decreasing = true;


            //If one flag is changes, then monotonic. If both change (both go to false), then trend changes twice making it not monotonic.
            for(int i = 1; i < array.length; i++ ){
                int previous = array[i-1];
                int current = array[i];

                System.out.println("Prev: "+ previous + "\t Current: "+ current);

                //Increasing
                if(previous > current){
                    increasing = false;
                }
                //Decreasing
                else if(previous < current){
                    decreasing = false;
                }

                if(!increasing && !decreasing){
                    return false;
                }
            }
            return true;
        }
    }
}
