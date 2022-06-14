package Fundamentals.BasicSyntaxis.Exercises;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int LostGames = Integer.parseInt(scanner.nextLine());
        double HeadsetP = Double.parseDouble(scanner.nextLine());
        double MouseP = Double.parseDouble(scanner.nextLine());
        double KeyboardP = Double.parseDouble(scanner.nextLine());
        double DisplayP = Double.parseDouble(scanner.nextLine());

        double handsetCost = (LostGames / 2) * HeadsetP;
        double mouseCost = (LostGames / 3) * MouseP;
        double keyboardCost = (LostGames / 6) * KeyboardP;
        double displayCost = (LostGames / 12) * DisplayP;

        double TC = handsetCost + mouseCost + keyboardCost + displayCost;



        System.out.printf("Rage expenses: %.2f lv.", TC);
    }
}
