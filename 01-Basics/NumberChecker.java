
import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = s.nextInt();

        if (a > 0) {
            System.out.println(a + " is positive");
        } 
        else if (a < 0) {
            System.out.println(a + " is negative");
        } 
        else {
            System.out.println(a + " is zero");
        }

        s.close();
    }
}
