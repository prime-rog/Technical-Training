import java.util.*;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name--");
        String name = sc.nextLine();
        System.out.println("Welcome " + name + " Please fill out your details for getting your marks report..");
        System.out.println("Enter Your Id--");
        int Id = sc.nextInt();
        System.out.println("Enter Your Year--");
        int year = sc.nextInt();
        System.out.println("Enter Your Branch--");
        sc.nextLine();
        String branch = sc.nextLine();
        System.out.println("Enter Your Automata marks --");
        double amarks = sc.nextDouble();
        System.out.println("Enter Your Software marks --");
        double smarks = sc.nextDouble();
        System.out.println("Enter Your Robotics marks --");
        double rmarks = sc.nextDouble();
        System.out.println("Enter Your Deep Learning marks --");
        double dmarks = sc.nextDouble();
        // Compute obj = new Compute();
        Compute obj1 = new Compute(amarks, smarks, rmarks, dmarks);
        System.out.println(amarks + smarks + rmarks + dmarks);
    }
}
