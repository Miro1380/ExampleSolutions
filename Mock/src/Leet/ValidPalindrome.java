package Leet;

//TODO Only iterate through half of string. Reduce to log n.
public class ValidPalindrome {
    public static void main(String []args){
        ValidPalindrome sol = new ValidPalindrome();
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "";

        //Expected true
        System.out.println(sol.isPalindrome(s1));

        //Expected false
        System.out.println(sol.isPalindrome(s2));

        //Expected true
        System.out.println(sol.isPalindrome(s3));

    }

    //65-> 'A' 90-> 'Z' , 97->'a'  122-> 'z'
    public boolean isPalindrome(String s){
        boolean isValid = true;
        String str = s.toLowerCase();
        String replace = str.replaceAll("\\W", "");
        int lSide = 0;
        int rSide = replace.length()-1;

        if(replace.equals("")) return true;

        while(isValid){
            //If characters at opposite ends match
            if(replace.charAt(lSide) != replace.charAt(rSide)){
                return false;
            }

            //If rCounter gets to left side(zero).
            if(rSide == 0 ){
                break;
            }

            rSide--;
            lSide++;

        }
        return isValid;
    }
}
