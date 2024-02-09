package exception.tryresource;

/*
    @author DanujaV
    @created 2/9/24 - 11:39 AM   
*/

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Enter number 1: ");
            int num1 = input.nextInt();
        }

        /*System.out.print("Enter number 2: ");
        int num2 = input.nextInt();*/
    }
}
