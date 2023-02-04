import java.util.Scanner;
import java.util.*;

public class Armstrongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;

        }
        n = temp;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem, count);
            n = n / 10;
        }
        if (sum == temp)
            System.out.println("yes");
        else
            System.out.println("No");

    }
}
