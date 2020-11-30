package Leet;

import java.util.HashMap;

public class AddStrings {
    /*
    Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
   */
    public static void main(String[]args){
        AddStrings sol = new AddStrings();

        sol.addStrings("1","2");
    }

    //Map 0-9 then multiply their position value e.g 1000 is 1 x 10 ^ 3
    public String addStrings(String num1, String num2) {

        int parse1 = 0;
        int l1 = num1.length();
        HashMap<String,Integer> map  = new HashMap<>();
        Character c = 1+'2';
        int test = Character.getNumericValue(c);
        System.out.println(test);
        for(int i = 0 ; i < num1.length(); i++){

        }

        return null;
    }
}
