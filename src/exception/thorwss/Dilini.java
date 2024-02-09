package exception.thorwss;

/*
    @author DanujaV
    @created 2/9/24 - 11:06 AM   
*/

import java.io.FileNotFoundException;

public class Dilini {
    public static void main(String[] args) {
        try {
            FileReaderDemo.readFile("xyzz.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
