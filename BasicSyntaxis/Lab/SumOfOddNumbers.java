package Fundamentals.BasicSyntaxis.Lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = Integer.parseInt(scanner.nextLine());
        int Sum = 1;
        for (int i = 1; i <= Number; i++) {
                System.out.println(2*i + 1);
                Sum += 2*i - 1;
        }
        System.out.printf("Sum: %d", Sum);
    }
}
