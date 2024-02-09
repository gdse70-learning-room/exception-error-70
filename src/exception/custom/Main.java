package exception.custom;

/*
    @author DanujaV
    @created 2/9/24 - 11:28 AM   
*/

import java.util.Scanner;

public class Main {
    private static void eligibleForTheVote(int age) throws AreYouCrazyException {
        if(age < 18) {
            throw new AreYouCrazyException("age is under 18");
        }
    }

    public static void main(String[] args) {
        System.out.print("Input an age: ");
        int age = new Scanner(System.in).nextInt();

        try {
            eligibleForTheVote(age);
        } catch (AreYouCrazyException e) {
            e.printStackTrace();
        }

    }
}
