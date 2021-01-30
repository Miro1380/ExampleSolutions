package AlgoExpert;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    public static void main(String[]args){
        String case1 = "([])(){}(())()()";
        System.out.println("Case 1: "+balancedBrackets(case1));

        String case2 = "(()agwg())((()agwga()())gawgwgag)";
        System.out.println("Case 2: "+balancedBrackets(case2));

        String case14 = ")[]}";
        System.out.println("Case 14: " + balancedBrackets(case14));

        String case15 = "(a)";
        System.out.println("Case 15: " + balancedBrackets(case15));

        String case17 = "(141[])(){waga}((51afaw))()hh()".trim();
        System.out.println("Case 17: "+ balancedBrackets(case17));

    }
    public static boolean balancedBrackets(String str) {
        //Clean string to only include brackets.
        String filtered = str.toLowerCase().replaceAll("[^{}\\[\\]\\(\\)]", "");
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0 ; i < filtered.length(); i++){
            char current = filtered.charAt(i);
            //If its an open go to if, closed goes to else
                if(current == '{'){
                    stack.push('}');
                }
                else if (current == '[') {
                    stack.push(']');
                }
                else if(current == '('){
                    stack.push(')');

                }else if(stack.isEmpty() || stack.pop() != current){
                    //When entry is a closed brace
                    //Check if stack is empty -> string begins with closed item -> fail
                    //Check if current is equal to stack item.
                    return false;
            }
                //System.out.println(stack.toString());
        }
        //If its empty by the end then even. Otherwise uneven.
        return stack.isEmpty();
    }

}
