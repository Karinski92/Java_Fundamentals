package Fundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMAintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> friendList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        int countBlacklisted = 0;
        int countLost = 0;

        while (!input.equals("Report")) {
            String [] toDo = input.split("\\s+");
            String command = toDo[0];

            switch (command) {
                case "Blacklist":
                    if (friendList.contains(toDo[1])) {
                        friendList.set(friendList.indexOf(toDo[1]), "Blacklisted");
                        System.out.printf("%s was blacklisted.%n", toDo[1]);
                        countBlacklisted ++;
                    } else {
                        System.out.printf("%s was not found.%n", toDo[1]);
                    }

                    break;
                case "Error":
                    int index = Integer.parseInt(toDo[1]);

                    if (index >= 0 && index <= friendList.size()-1) {
                        String username = friendList.get(index);
                        if (!username.contains("Blacklisted") && !username.equals("Lost")) {
                            friendList.set(index, "Lost");
                            System.out.printf("%s was lost due to an error.%n", username);
                            countLost++;
                        }
                    }

                    break;
                case "Change":
                    index = Integer.parseInt(toDo[1]);
                    String newName = toDo[2];


                    if (index >= 0 && index <= friendList.size()-1) {
                        String nameHolder = friendList.get(index);
                        friendList.set(index, newName);
                        System.out.printf("%s changed his username to %s.%n", nameHolder, newName);

                    }

                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %s%n", countBlacklisted);
        System.out.printf("Lost names: %s%n", countLost);
        friendList.forEach(friend -> System.out.print(friend + " "));
    }
}
