package exception.unchecked;

/*
    @author DanujaV
    @created 2/9/24 - 10:26 AM   
*/

import java.util.Scanner;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Start of the program.");

        Scanner input = null;

        System.out.print("Input a number: ");
        try {
            int num = input.nextInt();
            System.out.println("The number is: " + num);
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred.");
        }


        System.out.println("End of the program.");

    }
}
