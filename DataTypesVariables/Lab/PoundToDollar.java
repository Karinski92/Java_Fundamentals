package Fundamentals.DataTypesVariables.Lab;

import java.util.Scanner;

public class PoundToDollar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double Pound = Double.parseDouble(scanner.nextLine());
        double Dollar = Pound * 1.36;

        System.out.printf("%.3f", Dollar);
    }
}
