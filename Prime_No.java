import java.util.Scanner;

public class Prime_No {
    public static void main(String[] args) {
        // approaches to find wether a number is prime or not.
        Scanner sc = new Scanner(System.in);
        // while (true) {
        int n = sc.nextInt();
        boolean flag = true;
        if (n == 1)
            System.out.println("is Prime");

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                flag = false;

        }
        if (flag == true)
            System.out.println("is Prime");
        else
            System.out.println("Not a Prime");

        flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                flag = false;

        }
        if (flag == true)
            System.out.println("is Prime");
        else
            System.out.println("Not a Prime");

        flag = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = false;
                // System.out.println("enter");
            }

        }
        if (flag == true)
            System.out.println("is Prime");
        else
            System.out.println("Not a Prime");
        // }

        flag = true;
        // Best Approach.
        if (n % 2 == 0 || n % 3 == 0)
            flag = false;

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0)
                flag = false;
        }

        if (flag == true)
            System.out.println("is Prime");
        else
            System.out.println("Not a Prime");
    }

}
