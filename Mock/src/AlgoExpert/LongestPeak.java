package AlgoExpert;

public class LongestPeak {

    public static void main(String[]args){

        //Sample 1
        int[] array = {1,2,3,3,4,0,10,6,5,-1,-3,2,3};
        System.out.println(longestPeak(array));

    }

    public static int longestPeak(int[] array){
        int maxPeak = 0;
        int i = 1 ;
        while(i < array.length-1){
            int currentPeak = 0;
            int previous = array[i-1];
            int current = array[i];
            int next = array[i+1];
            boolean peak = current > previous && current >next;

            if(!peak){
                i+=1;
                continue;
            }

            //Count left and right from peak.
            int lIndex = i-2;
            int rIndex = i+2;
            while(lIndex>= 0 && array[lIndex] < array[lIndex+1]){
                lIndex -=1;
            }
            while (rIndex < array.length && array[rIndex] < array[rIndex-1]){
                rIndex +=1;
            }
            currentPeak = rIndex - lIndex -1;

            //Check if the currentPeak is larger than current max.
            if(currentPeak> maxPeak){
                maxPeak = currentPeak;
            }
            i = rIndex;
        }
        return maxPeak;
    }
}
