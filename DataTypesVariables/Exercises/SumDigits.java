package Fundamentals.DataTypesVariables.Exercises;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.nextLine();
        int sum = 0;
        int Number = Integer.parseInt(N);

        for (int i = 0; i < N.length(); i++) {
            int Digit = Number % 10;
            sum += Digit;
            Number /= 10;
        }

        System.out.println(sum);


    }
}
