package Fundamentals.DataTypesVariables.Exercises;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Pours = Integer.parseInt(scanner.nextLine());
        int Capacity = 255;
        int times = Pours;
        int Poured = 0;

        while (times != 0) {
            int Liters = Integer.parseInt(scanner.nextLine());

            if (Capacity >= Liters) {
                Capacity = Capacity - Liters;
                Poured += Liters;
            } else {
                System.out.printf("Insufficient capacity!%n");
            }
            times = times - 1;
        }
        System.out.printf("%d", Poured);

    }
}
