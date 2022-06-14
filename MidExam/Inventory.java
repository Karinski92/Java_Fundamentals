package Fundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inventory = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String [] toDo = input.split(" - ");
            String command = toDo[0];

            switch (command) {
                case "Collect":
                    if (!inventory.contains(toDo[1])) {
                        inventory.add(inventory.size(), toDo[1]);
                    }
                    break;
                case "Drop":
                    if (inventory.contains(toDo[1])) {
                        inventory.remove(toDo[1]);
                    }
                    break;
                case "Combine Items":
                    String [] items = toDo[1].split(":");
                    String oldItem = items[0];
                    String newItem = items[1];
                    int index = inventory.indexOf(oldItem) + 1;
                    if (inventory.contains(oldItem)) {
                        inventory.add(index, newItem);
                    }
                    break;
                case "Renew":
                    if (inventory.contains(toDo[1])) {
                        inventory.remove(toDo[1]);
                        inventory.add(inventory.size(), toDo[1]);
                    }

                    break;
            }
            input = scanner.nextLine();
        }
        System.out.print(inventory.get(0));
        for (int i = 1; i < inventory.size(); i++) {
            System.out.print(", " + inventory.get(i));
        }

    }
}
