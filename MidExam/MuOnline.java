package Fundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> dungeonRooms = Arrays.stream(scanner.nextLine().split("\\|+")).collect(Collectors.toList());
        int initialHealth = 100;
        int initialBitcoin = 0;
        int roomsPassed = 0;
        for (int i = 0; i < dungeonRooms.size(); i++) {
            String eachRoom = dungeonRooms.get(i);
            String[] rooms = eachRoom.split("\\s+");
            String command = rooms[0];
            if (initialHealth <= 0){
                break;
            }

            switch (command) {
                case "potion":
                    if (100-initialHealth <= Integer.parseInt(rooms[1])) {
                        System.out.printf("You healed for %d hp.%n", 100-initialHealth);
                        initialHealth += 100-initialHealth;
                        System.out.printf("Current health: %d hp.%n", initialHealth);
                        roomsPassed++;
                    } else {
                        System.out.printf("You healed for %d hp.%n", Integer.parseInt(rooms[1]));
                        initialHealth += Integer.parseInt(rooms[1]);
                        System.out.printf("Current health: %d hp.%n", initialHealth);
                        roomsPassed++;
                    }
                    break;
                case "chest":
                    System.out.printf("You found %d bitcoins.%n", Integer.parseInt(rooms[1]));
                    initialBitcoin += Integer.parseInt(rooms[1]);
                    roomsPassed ++;
                    break;
                default:
                    initialHealth -= Integer.parseInt(rooms[1]);
                    if (initialHealth <= 0) {
                        System.out.printf("You died! Killed by %s.%nBest room: %s%n", rooms[0], roomsPassed+1);

                        break;
                    } else {
                        System.out.printf("You slayed %s.%n", rooms[0]);
                        roomsPassed++;
                    }

                    break;
            }


        }
        if (roomsPassed == dungeonRooms.size()) {
            System.out.printf("You've made it!%nBitcoins: %s%nHealth: %s", initialBitcoin, initialHealth);

        }
    }
}
