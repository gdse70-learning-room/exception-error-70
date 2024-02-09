package error;

/*
    @author DanujaV
    @created 2/9/24 - 9:29 AM   
*/

public class StackOverflowErrorDemo {
    private static void myMethod() {
        System.out.println("Start myMethod");
        myMethod();
        System.out.println("End myMethod");
    }

    public static void main(String[] args) {
        System.out.println("Start Main method");
        myMethod();
        System.out.println("End Main method");
    }
}
