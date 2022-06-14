package Fundamentals.BasicSyntaxis.Exercises;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Budget = Double.parseDouble(scanner.nextLine());
        int Students = Integer.parseInt(scanner.nextLine());
        double SaberCost = Double.parseDouble(scanner.nextLine());
        double RobeCost = Double.parseDouble(scanner.nextLine());
        double BeltCost = Double.parseDouble(scanner.nextLine());

        double STC = (Math.ceil(Students *1.1)) * SaberCost;
        double RTC = RobeCost * Students;
        double BTC = BeltCost * Students - (Students / 6) * BeltCost;

        double TC = STC + RTC + BTC;

        if (Budget >= TC) {
            System.out.printf("The money is enough - it would cost %.2flv.", TC);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", TC - Budget);
        }
    }
}
