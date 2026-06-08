import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int sum = 0;
        int count = 0;

        while(t > 0){
            for(int i = 0; i < 3; i++){
                int n = sc.nextInt();

                sum += n;
            }
            if(sum >= 2) count++;
            sum = 0;
            t--;
        }
        System.out.println(count);
    }
}
