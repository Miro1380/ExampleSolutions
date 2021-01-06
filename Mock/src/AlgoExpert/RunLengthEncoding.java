package AlgoExpert;

import java.util.HashMap;
import java.util.Map;

public class RunLengthEncoding {

    public static void main(String[]args){
        String string = "AAAAAAAAAAAAABBCCCCDD";

        runLengthEncoding(string);
    }

    public static String runLengthEncoding(String string){
        //Per A.E.
        StringBuilder encoded = new StringBuilder();
        int length = 1;

        for(int i = 1 ; i < string.length(); i++){
            char curCharacter = string.charAt(i);
            char prevCharacter = string.charAt(i-1);

            //Check if character changes or is max of 9. Reset length to 0.
            if((curCharacter != prevCharacter) || length == 9){
                encoded.append(length);
                encoded.append(prevCharacter);
                length = 0;
            }

            length++;
        }

        //Last run case
        encoded.append(length);
        encoded.append(string.charAt(string.length()-1));

        System.out.println(encoded);

        return encoded.toString();
    }

    /*public static String runLengthEncoding(String string){

        Map<Character,Integer> map = new HashMap<>();
        String encoded = "";
        for(int i = 0; i < string.length(); i++){

            map.putIfAbsent(string.charAt(i), 0);

            if(map.containsKey(string.charAt(i))){
                //If map has key, increment by 1.
                map.put(string.charAt(i), map.get(string.charAt(i))+1);

                //If value is higher than 9 then decrease by 9 and append to string
                if(map.get(string.charAt(i))>9){
                    map.put(string.charAt(i),map.get(string.charAt(i))-9);
                    encoded += "9"+string.charAt(i);
                }
            }
            if(i > 0 &&( string.charAt(i) != string.charAt(i-1))) {
                System.out.println("Status: "+ map.entrySet());
                encoded+= map.get(string.charAt(i)) +""+ string.charAt(i);
            }

        }

        //All elements under 9 at this point??
        //How to add all remaining elements of the map to to the string??

        //9A4A2B4C2D


        System.out.println("Map: "+ map.entrySet());
        System.out.println("Encoded: "+ encoded);


        return "";
    } */
}
