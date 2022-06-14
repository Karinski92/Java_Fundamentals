package Fundamentals.MidExam;

import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cities = Integer.parseInt(scanner.nextLine());
        double totalProfit = 0;

        for (int i = 1; i <= cities; i++) {
            String city = scanner.nextLine();
            double ownerIncome = Double.parseDouble(scanner.nextLine());
            double ownerExpenses = Double.parseDouble(scanner.nextLine());

            if (i % 3 == 0 && i != 0) {
                ownerExpenses = ownerExpenses * 1.5;
            }

            if (i % 5 == 0 && i != 0) {
                ownerIncome = 0.9 * ownerIncome;
                if (i % 3 == 0) {
                    ownerExpenses = ownerExpenses / 1.5;
                }
            }
            double profit = ownerIncome - ownerExpenses;
            totalProfit += profit;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n", city, profit);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}
