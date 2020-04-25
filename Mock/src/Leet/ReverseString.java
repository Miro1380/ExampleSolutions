package Leet;

public class ReverseString {
    public static void main(String []args){
        /*
            Input: ["h","e","l","l","o"]
            Output: ["o","l","l","e","h"]
        * */
        ReverseString sol = new ReverseString();
        char[] arr1 = {'h','e','l','l','o'};

        sol.reverseString(arr1);
    }
    public void reverseString(char[] s) {
        int index = 0;
        char temp = ' ';
        for(int i = s.length-1; i > index; i--){
            temp = s[index];
            s[index] = s[i];
            s[i] = temp;
            index++;
        }

        for(char ch: s){
            System.out.println(ch);
        }
    }
}
