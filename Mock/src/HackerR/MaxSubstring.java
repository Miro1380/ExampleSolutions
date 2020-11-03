package HackerR;

//TODO Still fails 1 case. Review.
public class MaxSubstring {
    public static void main(String[]args){
        String s1 = "caberqiitefg";
        int k1 =5;

        findSubstring(s1,k1);
    }

    public static String findSubstring (String s, int k){
        int tCount = 0;
        String total = "";
        for(int i = 0; i < s.length()-k; i++){
            String str = s.substring(i, i+k);
            int count = 0;
            for(int j = 0; j< str.length(); j++){
                if(str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i'|| str.charAt(j) == 'o' || str.charAt(j) == 'u'){
                    count++;
                }
            }
            if(tCount < count){
                total = str;
            }
        }
        System.out.println(total);
        return total;
    }
}
