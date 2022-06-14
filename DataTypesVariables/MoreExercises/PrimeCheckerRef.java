package Fundamentals.DataTypesVariables.MoreExercises;

import java.util.Scanner;

public class PrimeCheckerRef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        for (int j = 2; j <= N; j++) {
            boolean Prime = true;
            for (int k = 2; k < j; k++) {
                if (j % k == 0) {
                    Prime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", j, Prime);
        }

    }
}
