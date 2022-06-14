package Fundamentals.Methods.Lab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        grade(Double.parseDouble(scanner.nextLine()));
    }
    public static void grade (double number) {
        if (number >= 2 && number <= 2.99) {
            System.out.printf("Fail");
        } else if (number >= 3 && number <= 3.49) {
            System.out.printf("Poor");
        } else if (number >= 3.49 && number <= 4.49) {
            System.out.printf("Good");
        } else if (number >= 4.5 && number <= 5.49) {
            System.out.printf("Very good");
        } else if (number >= 5.5 && number <= 6) {
            System.out.printf("Excellent");
        }
    }
}
