import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        int sum1 = 0;
        int sum2 = 0;
        int i = 0;

        while (left <= right && i < n) {
            if (i % 2 == 0) {
                if (arr[left] > arr[right]) {
                    sum1 += arr[left];
                    left++;
                } else {
                    sum1 += arr[right];
                    right--;
                }
            } else {
                if (arr[left] > arr[right]) {
                    sum2 += arr[left];
                    left++;
                } else {
                    sum2 += arr[right];
                    right--;
                }
            }
            i++;
        }
        System.out.println(sum1 + " " + sum2);

    }
}
