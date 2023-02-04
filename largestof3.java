import javax.lang.model.util.ElementScanner14;

public class largestof3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = 32;
        if (x > y && x > z)
            System.out.println("x is larget");
        else if (y > x && y > z)
            System.out.println("y is largest");
        else {
            System.out.println("z is larget");
        }
    }
}
