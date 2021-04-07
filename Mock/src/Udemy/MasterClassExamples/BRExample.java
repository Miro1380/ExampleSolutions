package Udemy.MasterClassExamples;

import java.io.*;

public class BRExample {

    public static void main(String[] args) {

//        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("states.txt")))) {
//
//            while (scanner.hasNext()){
//                System.out.println(scanner.next());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("states.txt")))) {

            while (br.ready()){
                System.out.println(br.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
