package Leet;

public class ImplementStr {
    public static void main(String[]args){
        /*
        * Input: haystack = "hello", needle = "ll"
          Output: 2
        * */
        ImplementStr sol = new ImplementStr();

        //Expected: 2
        int val = sol.strStr("hello", "ll");
        System.out.println(val);

        //Expected: -1;
        int val2 = sol.strStr("aaaa", "bba");
        System.out.println(val2);

        //Expected: 0
        int val3 = sol.strStr("test", "");
        System.out.println(val3);


        //Expected 0;
        int val4 = sol.strStr("a", "a");
        System.out.println(val4);

        //Expected 0
        int val5 = sol.strStr("aaa", "a");
        System.out.println(val5);

        //Expected 1
        int val6 = sol.strStr("mississippi", "issi");
        System.out.println(val6);
    }

    //Solved using indexOf() .
//    public int strStr(String haystack, String needle) {
//        //Get index of character.
//        int index = haystack.indexOf(needle);
//
//        //Check empty string case. Problem prompt returns 0.
//        if(needle.equals("")) return 0;
//
//        //If index not -1 return it.
//        return index >=0? index : -1;
//    }

    public int strStr(String haystack,String needle){
        String str = "";
        if(needle.equals("") || needle.equals(haystack)) return 0;


        for(int i=0; i < haystack.length();i++){
                str += haystack.charAt(i);
                if(str.contains(needle)) return str.length()-needle.length();
        }
        return -1;
    }
}
