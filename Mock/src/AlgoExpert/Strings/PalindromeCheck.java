package AlgoExpert.Strings;

public class PalindromeCheck {

    public static void main(String[]args){
     String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        // Write your code here.
        char[] chars = str.toCharArray();
        int length = chars.length-1;
        for(int i = 0; i < chars.length/2; i++){
            int rPointer = chars[length];
            int lPointer = chars[i];

            //System.out.println("l: "+ lPointer + " , r: "+ rPointer);
            if(lPointer != rPointer){
                return false;
            }
            length--;
        }
        return true;
    }
}
