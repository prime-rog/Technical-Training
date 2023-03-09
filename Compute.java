public class Compute {
    double amarks;
    double smarks;
    double rmarks;
    double dmraks;
    double sum;
    double percentage;

    public Compute() {
        System.out.println("Your MarksSheet--");
    }

    public Compute(double amarks, double smarks, double rmarks, double dmarks) {
        this();
        this.sum = amarks + smarks + rmarks + dmarks;
        this.percentage = (sum / 400) * 100;
        show();
    }

    public void show() {
        System.out.println("Your total Sum is--" + this.sum);
        System.out.println("Your Percentage is --" + this.percentage);
        showgrade(percentage);
    }

    public static void showgrade(double percentage) {
        if (percentage > 90)
            System.out.println("Your Grade is--A");
        else if (percentage > 80 && percentage <= 90)
            System.out.println("Your Grade is--B");
        else if (percentage > 70 && percentage <= 80)
            System.out.println("Your Grade is--C");
        else
            System.out.println("Your Grade is--D");
    }

}
