package Fundamentals.DataTypesVariables.Lab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= Num ; i++) {
            int sum = 0;
            int NewNum = i;

            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }

            boolean trueFalse = (sum == 5) || (sum == 7) || (sum == 11);
            String Outcome;

            if (trueFalse) {
                Outcome = "True";
            } else {
                Outcome = "False";
            }

            System.out.printf("%d -> %s%n", NewNum, Outcome);
            i = NewNum;

        }
    }
}
