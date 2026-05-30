import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        String s = "";

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> arr = new ArrayList<>(n);

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0) s += "Fizz";
            if(i % 5 == 0) s += "Buzz";

            if(s.isEmpty()){
                s = String.valueOf(i);
            }
            arr.add(s);
            s = "";
        }
        for(String a: arr){
            System.out.print(a + " ");
        }
    }
}
