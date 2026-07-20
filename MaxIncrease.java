import java.util.Scanner;

public class MaxIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCount = Integer.MIN_VALUE;
        int count = 1;

        for(int i = 1; i < n; i++){
            if(arr[i] >= arr[i - 1]) count++;
            else{
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
        maxCount = Math.max(maxCount, count);

        if (maxCount == Integer.MIN_VALUE)
            System.out.print(1);
        else
            System.out.print(maxCount);
        sc.close();
    }
}