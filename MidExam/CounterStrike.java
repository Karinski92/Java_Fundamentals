package Fundamentals.MidExam;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int wonGames = 0;
        int energy = initialEnergy;


        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);

            if (energy >= distance) {
                energy -= distance;
                wonGames ++;
                if (wonGames % 3 == 0) {
                    energy += wonGames;
                }

            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonGames, energy);
                energy -= distance;
                break;
            }
            input = scanner.nextLine();

        }
        if (energy >= 0) {
            System.out.printf("Won battles: %d. Energy left: %d", wonGames, energy);
        }

    }
}
