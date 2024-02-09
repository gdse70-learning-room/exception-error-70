package error;

/*
    @author DanujaV
    @created 2/9/24 - 9:37 AM   
*/
class DB {
    long[] data = new long[100000];

}

public class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        System.out.println("start main");

        DB[] db = new DB[10000];

        for (int i = 0; i < 10000; i++) {
            System.out.println(i+1);
            db[i] = new DB();
        }

        System.out.println("end main");
    }
}
