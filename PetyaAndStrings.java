import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int result = a.compareToIgnoreCase(b);

        if (result > 0)
            System.out.println(1);
        else if (result < 0)
            System.out.println(-1);
        else
            System.out.println(0);
        sc.close();
    }
}