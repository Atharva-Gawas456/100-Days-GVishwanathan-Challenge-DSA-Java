import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+')
                n--;
        }
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i) - '0';
        }

        Arrays.sort((arr));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
            if (i < n - 1)
                sb.append("+");
        }

        System.out.println(sb.toString());

        sc.close();
    }
}
