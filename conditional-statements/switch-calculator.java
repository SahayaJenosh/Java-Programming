import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter first number :");

        int a = s.nextInt();

        System.out.println("Enter second number :");

        int b = s.nextInt();

        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nEnter your choice: ");

        int choice = s.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Addition : " + (a + b));
                break;

            case 2:
                System.out.println("Substraction : " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication : " + (a * b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Division : " + ((double) a / b));
                } else {
                    System.out.println("Error: Division by Zero");
                }
                break;

            default:
                System.out.println("Invalid Choice!!");
        }
    }
}
