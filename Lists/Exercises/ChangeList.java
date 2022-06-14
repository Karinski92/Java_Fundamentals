package Fundamentals.Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String [] commands = input.split(" ");
            String command = commands[0];

            switch (command) {
                case "Delete":
                    int element = Integer.parseInt(commands[1]);
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) == element) {
                            list.remove(i--);
                        }
                    }
                    break;
                case "Insert":
                    int element1 = Integer.parseInt(commands[1]);
                    int index = Integer.parseInt(commands[2]);
                    list.add(index, element1);
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }

    }
}
