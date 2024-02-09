package exception.unchecked;

/*
    @author DanujaV
    @created 2/9/24 - 10:31 AM   
*/

public class IndexOutOfBoundExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Start of the program.");

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[4]);

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {

        }

        System.out.println("End of the program.");
    }
}
