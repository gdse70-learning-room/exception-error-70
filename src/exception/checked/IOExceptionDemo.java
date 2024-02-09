package exception.checked;

/*
    @author DanujaV
    @created 2/9/24 - 9:44 AM   
*/

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOExceptionDemo {
    public static void main(String[] args) {
        try {
            var reader = new FileReader("abc.txt");

            System.out.println("Huree!!! File found");
        } catch (FileNotFoundException e) {
            System.out.println("OOPS! File not found");
        }
    }
}
