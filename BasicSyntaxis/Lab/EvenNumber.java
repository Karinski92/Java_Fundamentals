package Fundamentals.BasicSyntaxis.Lab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        while (N % 2 != 0) {
            System.out.printf("Please write an even number.%n");
            N = Integer.parseInt(scanner.nextLine());
            }
        if (N % 2 == 0) {
            System.out.printf("The number is: %d", Math.abs(N));

        }
    }
}
