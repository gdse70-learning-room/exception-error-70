package exception.thorwss;

/*
    @author DanujaV
    @created 2/9/24 - 11:14 AM   
*/

import java.io.FileNotFoundException;

public class Gayumi {
    public static void main(String[] args) {
        try {
            FileReaderDemo.readFile("novel.txt");
        } catch (FileNotFoundException e) {

        }
    }
}
