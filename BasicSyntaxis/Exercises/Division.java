package Fundamentals.BasicSyntaxis.Exercises;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = Integer.parseInt(scanner.nextLine());
        if (Number % 10 == 0) {
            System.out.printf("The number is divisible by 10");
        } else if (Number % 7 == 0) {
            System.out.printf("The number is divisible by 7");
        } else if (Number % 6 == 0) {
            System.out.printf("The number is divisible by 6");
        } else if (Number % 3 == 0) {
            System.out.printf("The number is divisible by 3");
        } else if (Number % 2 == 0) {
            System.out.printf("The number is divisible by 2");
        } else {
            System.out.printf("Not divisible");
        }


    }
}
