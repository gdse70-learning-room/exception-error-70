package exception.finallyy;

/*
    @author DanujaV
    @created 2/9/24 - 10:40 AM   
*/

public class Main {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 2;

        try {
            int result = n1 / n2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Whatever happened, I will execute!");
        }
    }
}
