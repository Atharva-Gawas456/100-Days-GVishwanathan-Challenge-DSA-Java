import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        if (set.size() % 2 != 0)
            System.out.println("IGNORE HIM!");
        else
            System.out.println("CHAT WITH HER!");
        sc.close();
    }
}
