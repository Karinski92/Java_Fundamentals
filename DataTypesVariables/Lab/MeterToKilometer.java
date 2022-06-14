package Fundamentals.DataTypesVariables.Lab;

import java.util.Scanner;

public class MeterToKilometer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = Integer.parseInt(scanner.nextLine());

        double KM = M / 1000.0;

        System.out.printf("%.2f", KM);;
    }
}
