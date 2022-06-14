package Fundamentals.DataTypesVariables.MoreExercises;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N1 = Double.parseDouble(scanner.nextLine());
        double N2 = Double.parseDouble(scanner.nextLine());
        double Delta = N1 - N2;

        if (Math.abs(Delta) < 0.000001) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
