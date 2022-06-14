package Fundamentals.BasicSyntaxis.Lab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int Times = 1;
        while (Times <= 10) {
            System.out.printf("%d X %d = %d%n", N, Times, N * Times);
            Times ++;
        }
    }
}
