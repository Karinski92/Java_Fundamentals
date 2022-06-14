package Fundamentals.DataTypesVariables.Exercises;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        int N3 = Integer.parseInt(scanner.nextLine());
        int N4 = Integer.parseInt(scanner.nextLine());

        int result = (N1 + N2) / N3 * N4;

        System.out.println(result);
    }
}
