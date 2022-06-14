package Fundamentals.BasicSyntaxis.Exercises;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String User = scanner.nextLine();
        String Pass = scanner.nextLine();

        String RealPass = new StringBuffer(User).reverse().toString();
        int counter = 0;

        while (true) {
            if (!Pass.equals(RealPass)) {
                counter++;
                if (counter == 4) {
                    System.out.printf("User %s blocked!", User);
                    return;
                }
                System.out.printf("Incorrect password. Try again.%n");
            } else {
                System.out.printf("User %s logged in.", User);
                break;
            }
            Pass = scanner.nextLine();
        }
    }
}