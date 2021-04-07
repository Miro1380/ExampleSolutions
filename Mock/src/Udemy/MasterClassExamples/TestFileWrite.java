package Udemy.MasterClassExamples;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWrite {

    public static void main(String[] args) throws IOException {
        /*
        try {
            FileWriter file = new FileWriter("states.txt");
            file.write("California");
            file.write("Nebraska");
            file.write("New York");
            file.write("Nevada");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        //try with resources. No catch. main throws IO Exc.
        try(FileWriter file = new FileWriter("states.txt")) {
            file.write("California ");
            file.write("Nebraska ");
            file.write("New York ");
            file.write("Nevada ");
        }
    }
}
