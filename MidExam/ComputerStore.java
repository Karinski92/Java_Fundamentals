package Fundamentals.MidExam;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double NetCost = 0;
        double Tax = 0;
        double TC = 0;

        while (!input.equals("special") && !input.equals("regular")) {

            double PartPrice = Double.parseDouble(input);
            if (PartPrice < 0) {
                System.out.printf("Invalid price!%n");
            } else {
                NetCost = PartPrice + NetCost;
                Tax = 0.2 * NetCost;
                TC = NetCost + Tax;

            }
            input = scanner.nextLine();
        }
        if (TC == 0) {
            System.out.printf("Invalid order!%n");
        } else if (input.equals("special")) {
            TC = TC * 0.9;
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", NetCost);
            System.out.printf("Taxes: %.2f$%n", Tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", TC);
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", NetCost);
            System.out.printf("Taxes: %.2f$%n", Tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", TC);
        }
    }
}
