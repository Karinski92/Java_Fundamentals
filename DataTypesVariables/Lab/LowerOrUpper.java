package Fundamentals.DataTypesVariables.Lab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String L = scanner.nextLine();
        char Letter = L.charAt(0);

        if (Character.isUpperCase(Letter)) {
            System.out.printf("upper-case");
        } else {
            System.out.printf("lower-case");
        }
    }
}
