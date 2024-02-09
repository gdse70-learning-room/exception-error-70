package exception.unchecked;

/*
    @author DanujaV
    @created 2/9/24 - 10:09 AM   
*/

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Start of the program");

        int n1 = 20;
        System.out.print("Enter n2: ");
        int n2 = new Scanner(System.in).nextInt();

        try {
            int result = n1 / n2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("End of the program");
    }
}
