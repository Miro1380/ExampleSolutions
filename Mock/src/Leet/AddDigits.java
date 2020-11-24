package Leet;

//TODO Create not iterative method
public class AddDigits {
/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
             Since 2 has only one digit, return it.
 */
    public static void main(String[]args){
        AddDigits sol = new AddDigits();

        //Solution: 2
        sol.addDigits(38);

        //Sol: 1
        sol.addDigits(19);

    }

    public int addDigits(int num) {
        String[] split = Integer.toString(num).split("");
        int sum = 0;
        for(String s: split){
            System.out.println("s: "+ s);
            sum+= Integer.parseInt(s);
            if(sum > 9){
                sum = sum/10 + sum%10;
            }
        }
        System.out.println("sum: "+sum);
        System.out.println();
        return sum;
    }
}
