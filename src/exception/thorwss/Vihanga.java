package exception.thorwss;

/*
    @author DanujaV
    @created 2/9/24 - 11:05 AM   
*/

import java.io.FileNotFoundException;

public class Vihanga {
    public static void main(String[] args) {
        try {
            FileReaderDemo.readFile("samplee.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
