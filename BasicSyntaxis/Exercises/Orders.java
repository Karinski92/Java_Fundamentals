package Fundamentals.BasicSyntaxis.Exercises;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Orders = Integer.parseInt(scanner.nextLine());
        double TC = 0.00;

        for (int i = 1; i <= Orders; i++) {

            double FinalPrice = 0;

            double Price = Double.parseDouble(scanner.nextLine());;
            int Days = Integer.parseInt(scanner.nextLine());
            int CapCount = Integer.parseInt(scanner.nextLine());
            FinalPrice = (Days * CapCount) * Price;
            System.out.printf("The price for the coffee is: $%.2f%n", FinalPrice);
            TC += FinalPrice;

        }

        System.out.printf("Total: $%.2f", TC);


    }
}
