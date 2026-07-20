import java.util.Scanner;

public class AliceBobC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        int sum1 = arr[left];
        int sum2 = arr[right];

        while (left < right) {
            if (sum1 < sum2) {
                sum1 += arr[left];
                left++;
            } else {
                sum2 += arr[right];
                right--;
            }
        }
        System.out.println((left - 1) + " " + (n - left + 1));
        sc.close();
    }
}
