import java.util.*;

public class GCD {
    public static void main(String[] args) {
        // find GCD of two numbers.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD of " + a + " and " + b + " is " + findGCD(a, b));

    }

    public static int findGCD(int x, int y) {
        if (y == 0)
            return x;
        return findGCD(y, x % y);

    }

}
