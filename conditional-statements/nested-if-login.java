import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter username :");

        String a = s.nextLine();

        if (a.equals("admin")) {

            System.out.println("Enter password :");

            String b = s.nextLine();

            if (b.equals("java123")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Password Incorrect!!");
            }

        } else {
            System.out.println("Incorrect username!!");
        }
    }
}
