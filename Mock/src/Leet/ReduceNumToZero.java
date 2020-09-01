package Leet;

public class ReduceNumToZero {

    /*
    Given a non-negative integer num, return the number of steps to reduce it to zero.
    If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
     */

    public static void main(String[]args){

        ReduceNumToZero sol = new ReduceNumToZero();
        //Output 6
        int case1  = 14;
        sol.numberOfSteps(case1);

        //Output : 4
        int case2 = 8;
        sol.numberOfSteps(case2);

        //Output 12
        int case3 = 123;
        sol.numberOfSteps(case3);
    }


    public int numberOfSteps (int num) {
        int steps = 0;
        while(num != 0){
            //Check even condition
            if(num % 2 == 0){
                //True. Divide by 2
                num /= 2;
            }
            else {
                //False. Subtract 1
                num-= 1;
            }
            //Step always performed
            steps++;
        }
        return steps;
    }
}
