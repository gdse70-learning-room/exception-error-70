package exception.checked;

/*
    @author DanujaV
    @created 2/9/24 - 10:03 AM   
*/

public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Start of the program");

        try {
            Class.forName("Student");

            System.out.println("Class found");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }

        System.out.println("End of the program");
    }
}
