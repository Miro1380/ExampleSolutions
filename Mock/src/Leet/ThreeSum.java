package Leet;

import java.util.*;

/*
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
* */
public class ThreeSum {
    public static void main (String []args){

        ThreeSum sol = new ThreeSum();

        //Expected [bat], [nat,tan],[ate,eat,tea]
        String[] strArr = {"eat","tea", "tan", "ate", "nat", "bat"};
        sol.groupAnagrams(strArr);

        //Expected "", ""
        String[] eArr = {"",""};
        sol.groupAnagrams(eArr);

        //Expected ""
        String [] eArr2 = {""};
        sol.groupAnagrams(eArr2);
    }

    public List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> map = new HashMap<>();

        //Empty array case
        if(strs.length == 0 ){
            return new ArrayList<>();
        }

        //Sort each element in the array to id anagrams "eat" -> aet, "tea" -> aet, "ate" -> aet.
        for(int i=0; i < strs.length; i++){
            //Sort current word lexicographically -> s
            String cStr = strs[i];
            char[] c = cStr.toCharArray();
            Arrays.sort(c);
            String s = new String(c);

            //If map has key, get value list and add current word.
            //else make a new entry and set a new list for future hits.
            if(map.containsKey(s)){
                System.out.println("Addding "+ s);
                map.get(s).add(strs[i]);
            }else {
                List<String> tList = new ArrayList<>();
                tList.add(cStr);
                map.put(s, tList);
            }
        }

        List<List<String>> list = new ArrayList<>(map.values());
        return list;
    }
}
