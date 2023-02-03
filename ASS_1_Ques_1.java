import java.util.*;

class ASS_1_Ques_1 {
    public static void main(String[] args) {

        // Check whether a number is odd or even without using modulo operator
        // importing and using Scanner class for taking input from user.

        Scanner sc = new Scanner(System.in);

        // x is the variable we will check for odd or even

        int x = sc.nextInt();

        int temp = x;

        x = x / 2;
        x = x * 2;
        if (x == temp)
            System.out.println("Input Number is Even.");
        else
            System.out.println("Input Number is Odd.");

    }
}