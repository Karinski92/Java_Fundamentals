package Fundamentals.DataTypesVariables.Exercises;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            String Letter = scanner.nextLine();
            int ascii = Letter.charAt(0);
            sum += ascii;
            
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
