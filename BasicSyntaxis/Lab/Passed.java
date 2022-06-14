package Fundamentals.BasicSyntaxis.Lab;

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Grade = Double.parseDouble(scanner.nextLine());
        if (Grade >= 3.00) {
            System.out.printf("Passed!");
        } else {
            System.out.printf("Failed!");
        }
    }
}
