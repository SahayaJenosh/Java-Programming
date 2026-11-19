import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your mark :");

        int a = s.nextInt();

        if (a <= 100 && a >= 0) {

            if (a >= 90) {
                System.out.println("Grade A");
            } else if (a >= 80) {
                System.out.println("Grade B");
            } else if (a >= 70) {
                System.out.println("Grade C");
            } else if (a >= 60) {
                System.out.println("Grade D");
            } else {
                System.out.println("Fail");
            }

        } else {
            System.out.println("Invalid Input");
        }
    }
}
