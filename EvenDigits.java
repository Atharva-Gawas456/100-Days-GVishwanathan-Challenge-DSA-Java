public class EvenDigits {
    public static int even_digit_count(int n){
        int count = 0;

        while(n != 0){
            count++;
            n /= 10;
        }
        return count % 2 == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};

        int count = 0;

        for(int a: arr){
            count += even_digit_count(a);
        }
        System.out.println("Total no. of number with even digits in array is " + count);
    }
}
