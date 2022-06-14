package Fundamentals.Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String [] commands = input.split("\\s+");
            String command = commands[0];

            switch (command) {
                case "Add":
                    list.add(Integer.parseInt(commands[1]));
                    break;
                case "Insert":
                    int number = Integer.parseInt(commands[1]);
                    int index = Integer.parseInt(commands[2]);
                    if (index < 0 || index >= list.size()) {
                        System.out.println("Invalid index");
                    } else {
                        list.add(index, number);
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(commands[1]);
                    if (index < 0 || index >= list.size()) {
                        System.out.println("Invalid index");
                    } else {
                        list.remove(index);
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(commands[2]);
                    if (commands[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            list.add(list.get(0));
                            list.remove(0);
                        }
                    } else if (commands[1].equals("right")) {
                        for (int i = 0; i < count; i++) {
                            list.add(0,list.get(list.size() - 1));
                            list.remove(list.size() - 1);
                        }
                    }
            }
            input = scanner.nextLine();
        }
        list.forEach(element -> System.out.print(element + " "));
    }
}
