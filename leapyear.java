import java.util.*;

public class leapyear {

    public static void main(String[] args) {
        // code to check whether a given year is leap year or not.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 4 == 0) {
            if (x % 100 == 0) {
                if (x % 400 == 0)
                    System.out.println("x is leap year");
                else
                    System.out.println("not a leap year");

            } else {
                System.out.println(" x is leap year");
            }

        } else
            System.out.println("Not a leap year");

    }
}
