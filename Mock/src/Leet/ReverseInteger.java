package Leet;

public class ReverseInteger {

    public static void main(String[]args){

    }

    public int reverse(int x) {
        System.out.println(x);
        String str = new StringBuilder(Integer.toString(Math.abs(x))).reverse().toString();
        System.out.println(str);
        try{
            if(x < 0){
                str = "-"+str;
            }
            return Integer.parseInt(str);
        }
        catch(NumberFormatException e){
            return 0;
        }

    }
}
