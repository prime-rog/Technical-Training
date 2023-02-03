import java.util.*;

public class reversenumber {
    public static void main(String[] args) {
        // find reverse of a number.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        System.out.println(rev);
    }

}
