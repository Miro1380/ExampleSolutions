package AlgoExpert;

public class CaesarCipherEncryptor {

    public static void main(String[]args){

        String str = "xyz";
        int key = 2;
        caesarCypherEncryptor(str,2);

        String str2 = "abc";
        int k2 = 52;
        caesarCypherEncryptor(str2,k2);
    }

    public static String caesarCypherEncryptor(String str, int key) {

        StringBuilder cipher = new StringBuilder();
        char[] ch = str.toCharArray();
        int nKey = key % 26;
        for(int i = 0; i < ch.length; i++){
            char current = (char) ((ch[i] + nKey) );
            //System.out.println(current);
            if(current > 'z'){
                current = (char)(current - 26);
            }
            //System.out.println(current);
            cipher.append( current);
        }


        String strFinal = cipher.toString();
        System.out.println(strFinal+ "\n");
        return strFinal;
    }
}
