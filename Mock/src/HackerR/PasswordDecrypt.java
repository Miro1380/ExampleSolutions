package HackerR;

public class PasswordDecrypt {
    public static void main(String []args){

        //"hAck3rr4nk" -> "43Ah*ck0rr0nk"
        String s = "hAck3rr4nk";
        decryptPassword(s);

    }

    public static String decryptPassword(String s){
        char[] encrypted =s.toCharArray() ;
        System.out.println("String: "+ s);
        StringBuilder str = new StringBuilder(s);


//        for(int i = 0 ; i < encrypted.length-1;i++){
////            char character = encrypted[i];
////            System.out.println("char: "+ character);
////            //Lowercase and next char is uppercase
////            if(character >= 'a' && character <= 'z'){
////                char nextChar = encrypted[i+1];
////                if(nextChar >= 'A' && nextChar<= 'Z'){
////                    //System.out.println("nxt: "+nextChar);
////                    encrypted[i] = nextChar;
////                    encrypted[i+1] = character;
////                    encrypted[i+2] = '*';
////                    i+= 2;
////                }
////            }else if (s.charAt(i) >=1 && s.charAt(i) <= 9){
////                //Character is a number, replace original with 0 and move to i+1
////                encrypted[i] = 0 ;
////                String joined = encrypted.toString();
////                joined += character + "" + encrypted;
////                System.out.println("joined");
////
////                i+= 1;
////            }else i+= 1;
////        }

        for(int i = 0 ; i < str.length()-1;i++){
            char character = encrypted[i];
            System.out.println("char: "+ character);
            //Lowercase and next char is uppercase
            if(character >= 'a' && character <= 'z'){
                char nextChar = encrypted[i+1];
                if(nextChar >= 'A' && nextChar<= 'Z'){
                    str.setCharAt(i+1, character);
                    str.setCharAt(i, nextChar);
                    i+= 2;
                }
            }else if (s.charAt(i) >=1 && s.charAt(i) <= 9){
                //Character is a number, replace original with 0 and move to i+1
                str.setCharAt(s.charAt(i), '0');
                str.insert(0,s.charAt(i));
                i+= 1;
            }else i+= 1;
        }

        System.out.println("STR: "+str);
        String fin = encrypted.toString();
        return fin;
    }
}
