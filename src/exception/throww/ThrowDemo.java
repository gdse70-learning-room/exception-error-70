package exception.throww;

/*
    @author DanujaV
    @created 2/9/24 - 11:17 AM   
*/

import java.util.Scanner;

public class ThrowDemo {
    private static void eligibleForTheVote(int age) {
        if(age < 18) {
            throw new ArithmeticException("You are not eligible for the vote");
//            System.out.println("You are not eligible for the vote");
        } else {
            System.out.println("You are eligible for the vote");
        }
    }

    public static void main(String[] args) {
        System.out.print("Input an age: ");
        int age = new Scanner(System.in).nextInt();

        try {
            eligibleForTheVote(age);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
