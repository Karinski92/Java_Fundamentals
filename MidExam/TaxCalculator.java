package Fundamentals.MidExam;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] line = input.split(">>");
        String[] dataForAVehicle = new String[2];
        int sumOfAfamilyTax = 0;
        int sumOfAheavyDutyTax = 0;
        int sumOfAsportsTax = 0;

        for (String info : line) {
            dataForAVehicle = info.split(" ");

        for (int i = 0; i < dataForAVehicle.length; i++) {
            String carType = dataForAVehicle[0];
            int taxForOneYear = Integer.parseInt(dataForAVehicle[1]);
            int km = Integer.parseInt(dataForAVehicle[2]);
            int tax = 0;
            int initialTax = 0;
            switch (carType) {
                case "family":
                    initialTax = 50;
                    for (int j = 1; j <= taxForOneYear; j++) {
                        tax = initialTax - 5;
                        initialTax = tax;
                    }
                    sumOfAfamilyTax = (km / 3000) * 12 + tax;
                    System.out.printf("A %s car will pay %d euros in taxes.%n", carType, sumOfAfamilyTax);
                    break;
                case "heavyDuty":
                    initialTax = 80;
                    for (int j = 1; j <= taxForOneYear; j++) {
                        tax = initialTax - 8;
                        initialTax = tax;
                    }
                    sumOfAheavyDutyTax = (km / 9000) * 14 + initialTax;
                    System.out.printf("A %s car will pay %d euros in taxes.", carType, sumOfAheavyDutyTax);
                    break;
                case "sports":
                    initialTax = 100;
                    for (int j = 1; j <= taxForOneYear; j++) {
                        tax = initialTax - 9;
                        initialTax = tax;
                    }
                    sumOfAsportsTax = (km / 2000) * 18 + initialTax;
                    System.out.printf("A %s will pay %d euros in taxes.", carType, sumOfAsportsTax);
                    break;
                default:
                    System.out.print("Invalid car type");
            }
            }

        }
        int sum = sumOfAfamilyTax + sumOfAheavyDutyTax + sumOfAsportsTax;
        System.out.printf("The National Revenue Agency will collect %d euros in taxes.", sum);
    }
}