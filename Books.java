import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int count = Integer.MIN_VALUE;

        int currSum = 0;

        for (int right = 0; right < n; right++) {
            currSum += arr[right];

            while (currSum > t) {
                
                currSum -= arr[left];
                left++;
            }
            count = Math.max(count, right - left + 1);
        }
        System.out.println(count);
        sc.close();
    }
}