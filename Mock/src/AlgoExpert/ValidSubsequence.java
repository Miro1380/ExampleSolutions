package AlgoExpert;

import java.util.Arrays;
import java.util.List;

public class ValidSubsequence {

    public static void main(String[]args){
        List<Integer> sequence = Arrays.asList(1,6,-1,10);
        List<Integer> list = Arrays.asList(5,1,22,25,6,-1,8,10);

        System.out.println(isValidSubsequence(list,sequence));
    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        //Order matters for 'sequence'
        // Write your code here.
        boolean isValid = true;
        int pos = 0;
        for(int i= 0 ; i < array.size();i++){
            if(pos == sequence.size()){
                break;
            }

            int main = array.get(i);
            int seq = sequence.get(pos);
            if(main == seq){
                pos++;
            }
        }

        isValid = pos == sequence.size()? true : false;
        return isValid;
    }
}
