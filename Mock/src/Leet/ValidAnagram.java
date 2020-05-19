package Leet;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[]args){
        ValidAnagram sol = new ValidAnagram();

        //Expected: true
        System.out.println(sol.isAnagram("anagram","nagaram"));

        //Expected: false
        System.out.println(sol.isAnagram("rat","car"));

        //Expected false
        System.out.println(sol.isAnagram("ab", "a"));

        //Expected false
        System.out.println(sol.isAnagram("a", "ab"));

    }
//
//    public boolean isAnagram(String s, String t) {
//        HashMap<Character, Integer> dictionary = new HashMap<>();
//        for(Character ch: s.toCharArray()){
//            if(!dictionary.containsKey(ch)){
//                dictionary.put(ch, 1);
//            }else { dictionary.put(ch, dictionary.get(ch)+1 ) ;}
//        }
//
//        for(Character ch: t.toCharArray()){
//            if(dictionary.containsKey(ch)){
//                dictionary.put(ch, dictionary.get(ch)-1);
//            }else return false;
//        }
//
//        for(Integer vals: dictionary.values()){
//            if(vals >0){
//                return false;
//            }
//        }
//        return true;
//    }

    public boolean isAnagram(String s, String t){
        char[] sSorted = s.toCharArray();
        char[] tSorted = t.toCharArray();
        Arrays.sort(sSorted);
        Arrays.sort(tSorted);

        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length();i++){
            if(sSorted[i] != tSorted[i]){
                return false;
            }
        }
        return true;
    }
}
