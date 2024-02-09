package exception.thorwss;

/*
    @author DanujaV
    @created 2/9/24 - 11:03 AM   
*/

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {   //Danuja
    static void readFile(String fileName) throws FileNotFoundException {
        var reader = new FileReader(fileName);
    }
}
