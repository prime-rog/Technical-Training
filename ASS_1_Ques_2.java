import java.util.Scanner;

public class ASS_1_Ques_2 {
    public static void main(String[] args) {
        try (// Chech weather a character is alphabet or not using ternary operator
                Scanner sc = new Scanner(System.in)) {
            String st = sc.next();
            // Taking first character of the given string to check.
            char ch = st.charAt(0);
            // checking charcter by ASCII code of alphabets.
            String ans = ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) ? "Yes" : "No";

            System.out.println("The given character is a charcter :-" + ans);
        }

    }
}
