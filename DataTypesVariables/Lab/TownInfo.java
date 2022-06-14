package Fundamentals.DataTypesVariables.Lab;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Town = scanner.nextLine();
        int Population = Integer.parseInt(scanner.nextLine());
        int KM2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", Town, Population, KM2);
    }
}
