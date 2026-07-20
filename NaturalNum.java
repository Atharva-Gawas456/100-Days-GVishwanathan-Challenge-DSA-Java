import java.util.Scanner;

public class NaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = 0;
        int ans = 0;
        int a = 0;

        for (int i = 1; i <= 100 && m < n && a < k; i++) {
            if (arr[m] == i) {
                m++;
            }else{
                a++;
                if(a == k - 1) ans = i;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}