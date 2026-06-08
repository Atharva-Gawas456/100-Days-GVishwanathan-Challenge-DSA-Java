import java.util.Scanner;

public class BitPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int t = sc.nextInt();

        while(t > 0){
            String s = sc.next();

            if(s.equals("X++")) x++;
            else if(s.equals("++X")) ++x;
            else if(s.equals("X--")) x--;
            else --x;
            t--;
        }
        System.out.println(x);
    }
}
