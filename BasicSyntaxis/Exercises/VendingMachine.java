package Fundamentals.BasicSyntaxis.Exercises;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double Sum = 0.00;

        double NutsCost = 2.00;
        double WaterCost = 0.70;
        double CrispCost = 1.50;
        double SodaCost = 0.80;
        double CokeCost = 1.00;


        while (!input.equals("Start")) {
            double Coins = Double.parseDouble(input);
            if (Coins == 0.1 || Coins == 0.2 || Coins == 0.5 || Coins == 1 || Coins == 2) {
                Sum += Coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", Coins);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")) {

            if (input.equals("Nuts")) {
                if (Sum > NutsCost) {
                    System.out.printf("Purchased Nuts%n");
                    Sum -= NutsCost;
                } else {
                    System.out.printf("Sorry, not enough money%n");
                }

            } else if (input.equals("Water")) {
                if (Sum >= WaterCost) {
                    System.out.printf("Purchased Water%n");
                    Sum -= WaterCost;
                } else {
                    System.out.printf("Sorry, not enough money%n");
                }

            } else if (input.equals("Crisps")) {
                if (Sum >= CrispCost) {
                    System.out.printf("Purchased Crisps%n");
                    Sum -= CrispCost;
                } else {
                    System.out.printf("Sorry, not enough money%n");
                }

            } else if (input.equals("Soda")) {
                if (Sum >= SodaCost) {
                    System.out.printf("Purchased Soda%n");
                    Sum -= SodaCost;
                } else {
                    System.out.printf("Sorry, not enough money%n");
                }

            } else if (input.equals("Coke")) {
                if (Sum >= CokeCost) {
                    System.out.printf("Purchased Coke%n");
                    Sum -= CokeCost;
                } else {
                    System.out.printf("Sorry, not enough money%n");
                }

            } else {
                System.out.printf("Invalid product%n");

            }

            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", Sum);
    }
}
