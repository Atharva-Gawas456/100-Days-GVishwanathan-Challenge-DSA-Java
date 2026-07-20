import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        String capitalize = a.substring(0, 1).toUpperCase() + a.substring(1);

        System.out.println(capitalize);
        sc.close();
    }
}