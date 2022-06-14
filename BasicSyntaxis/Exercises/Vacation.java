package Fundamentals.BasicSyntaxis.Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String Type = scanner.nextLine();
        String Day = scanner.nextLine();
        double CostPerson = 0;
        switch (Day) {
            case "Friday":
                if (Type.equals("Students")) {
                    CostPerson = 8.45;
                } else if (Type.equals("Business")) {
                    CostPerson = 10.90;
                } else if (Type.equals("Regular")) {
                    CostPerson = 15;
                }
                break;
            case "Saturday":
                if (Type.equals("Students")) {
                    CostPerson = 9.80;
                } else if (Type.equals("Business")) {
                    CostPerson = 15.60;
                } else if (Type.equals("Regular")) {
                    CostPerson = 20;
                }
                break;
            case "Sunday":
                if (Type.equals("Students")) {
                    CostPerson = 10.46;
                } else if (Type.equals("Business")) {
                    CostPerson = 16;
                } else if (Type.equals("Regular")) {
                    CostPerson = 22.50;
                }
                break;
        }
        double TotalCost = N * CostPerson;
        if (Type.equals("Students") && N >= 30) {
            TotalCost = TotalCost * 0.85;
        } else if (Type.equals("Business") && N >= 100) {
            TotalCost = TotalCost - 10 * CostPerson;
        } else if (Type.equals("Regular") && N >= 10 && N <= 20) {
            TotalCost = TotalCost * 0.95;
        }

        System.out.printf("Total price: %.2f", TotalCost);
    }
}
