package AlgoExpert.Strings;

import java.util.HashMap;

public class NonRepeatingCharacter {

    public static void main(String[] args) {
        NonRepeatingCharacter test = new NonRepeatingCharacter();
        System.out.println(test.firstNonRepeatingCharacter("abcdcaf"));
    }

    public int firstNonRepeatingCharacter(String string) {

        HashMap<Character, Integer> map = new HashMap<>();

        //Add characters to map. If multiple occurrences, increase count.
        for(int i = 0; i < string.length(); i++){
            char character = string.charAt(i);
            map.putIfAbsent(character,0);

            if(map.containsKey(character)){
                map.put(character,map.get(character)+1);
            }
        }

        //Iterate over string. If current char only has an entry of 1 return index and exit.
        for(int i = 0; i < string.length(); i++){
            char current = string.charAt(i);
            if(map.get(current)== 1){
                return i;
            }
        }

        return -1;
    }
}
