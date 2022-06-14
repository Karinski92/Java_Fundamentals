package Fundamentals.DataTypesVariables.Lab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N1 = scanner.nextLine();
        String N2 = scanner.nextLine();
        String N3 = scanner.nextLine();

        System.out.printf("%s %s %s", N3, N2, N1);
    }
}
