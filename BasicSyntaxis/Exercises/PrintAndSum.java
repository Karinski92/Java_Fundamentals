package Fundamentals.BasicSyntaxis.Exercises;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = N1; i <= N2 ; i++) {
            System.out.printf("%d ", i);
            sum += i;

        }
        System.out.printf("%nSum: %d", sum);
    }
}
