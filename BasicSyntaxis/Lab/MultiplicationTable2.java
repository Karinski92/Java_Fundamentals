package Fundamentals.BasicSyntaxis.Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Times = M;
        while (Times <= 10) {
            System.out.printf("%d X %d = %d%n", N, Times, N * Times);
            Times ++;
        }
        if (M > 10) {
            System.out.printf("%d X %d = %d%n", N, Times, N * Times);
        }
    }
}
