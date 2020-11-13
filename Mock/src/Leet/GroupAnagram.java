package Leet;

import java.util.*;

public class GroupAnagram {

    /*
    Example 1:
    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    Example 2:
    Input: strs = [""]
    Output: [[""]]

    Example 3:
    Input: strs = ["a"]
    Output: [["a"]]
     */

    public static void main(String[]args){
        GroupAnagram sol = new GroupAnagram();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        sol.groupAnagrams(strs);
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        //Sort word lexicographically, use as a key, go through word list and match with key after sorting current word.
        HashMap<String,ArrayList<String>> map = new HashMap();
        for(String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sorted = Arrays.toString(c);
            //System.out.println("Sorted: "+ sorted + " ,current: "+ str);
            ArrayList list = new ArrayList();

            //If word is in list, add it.
            if(map.containsKey(sorted)){
                //System.out.println("Contains Key");
               list = map.get((sorted));
               //System.out.println("Sorted: "+ sorted);
               list.add(str);
               //System.out.println("STR: "+ str);
               map.put(sorted,list);
            }
            //If not in map, add it to list and pair it.
            else{
                //System.out.println("Else: STR " + str);
                ArrayList temp = new ArrayList();
                temp.add(str);
                map.put(sorted,temp);
            }

            //System.out.println("Keys: "+map.keySet());
        }



        List<List<String>> result = new ArrayList<List<String>>();
        for (ArrayList<String> value : map.values()) {

            result.add(value);
        }

        for(int i = 0; i < result.size(); i++){
            System.out.println("i: " + i + ", " + result.get(i).toString());
        }

        return result;
    }

}
