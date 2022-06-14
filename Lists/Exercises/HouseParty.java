package Fundamentals.Lists.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCommands = Integer.parseInt(scanner.nextLine());
        List<String> partyList = new ArrayList<>();


        for (int i = 0; i < numberCommands; i++) {
            String input = scanner.nextLine();
            String[] rsvp = input.split(" ");
            String name = rsvp[0];
            if (!input.contains("not")) {
                if (partyList.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    partyList.add(name);
                }
            } else {
                if (partyList.contains(name)) {
                    partyList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        partyList.forEach(person -> System.out.println(person));

    }
}
