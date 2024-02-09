package exception.checked;

/*
    @author DanujaV
    @created 2/9/24 - 9:44 AM   
*/

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Start Main method");
        try {
            var reader = new FileReader("abc.txt");

            System.out.println("Huree!!! File found");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
//            System.out.println("OOPS! File not found");
        }

        System.out.println("End Main method");
    }
}
