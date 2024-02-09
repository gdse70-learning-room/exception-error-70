package exception.unchecked;

/*
    @author DanujaV
    @created 2/9/24 - 10:20 AM   
*/

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Start of the program");

        String n1 = "10";
        String n2 = "20";

        try {
            int tot = Integer.parseInt(n1) + Integer.parseInt(n2);
            System.out.println("Total: " + tot);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }

        System.out.println("End of the program");
    }
}
