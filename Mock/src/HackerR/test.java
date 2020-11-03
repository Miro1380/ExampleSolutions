package HackerR;

import java.util.Stack;

public class test {
    public static void main(String[]args){
        String str = "{}[](";
        Stack<Character> stack = new Stack<>();
        boolean valid = true;

        for(int i = 0 ; i< str.length()/2; i++){
            char current = str.charAt(i);
            if(current == '('){
                stack.push(')');
            }else if(current == '['){
                stack.push(']');
            }
            else if(current == '{'){
                stack.push('}');
            }
            else{
                if(stack.pop() != current){
                     valid = false;
                }
            }
            System.out.println(valid);
        }



    }
}
