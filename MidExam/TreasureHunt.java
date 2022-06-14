package Fundamentals.MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split("\\|+")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {
            String [] toDo = input.split(" ");
            String command = toDo[0];
            switch (command) {
                case "Loot":
                    for (int i = 1; i <= toDo.length-1 ; i++) {
                        if (!items.contains(toDo[i])) {
                            items.add(0,toDo[i]);
                        }
                    }
                    break;
                case "Drop":
                    if (Integer.parseInt(toDo[1]) >= 0 && Integer.parseInt(toDo[1]) < items.size()) {
                        String holder = items.get(Integer.parseInt(toDo[1]));
                        items.remove(Integer.parseInt(toDo[1]));
                        items.add(holder);
                        }

                    break;

                case  "Steal":
                    int index = items.size() - Integer.parseInt(toDo[1]);
                    if (index > items.size()) {
                        index = 0;
                    }
                    List<String> removed = items.subList(index, items.size());
                    items.subList(index, items.size()).clear();

                    System.out.print(removed.get(0));
                    for (int i = 1; i < removed.size() - 1; i++) {
                        System.out.println( ", " + removed.get(i));
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        int itemsLength = 0;
        for (int i = 0; i < items.size(); i++) {
            itemsLength += items.get(i).length();
        }
        double avrgGain = itemsLength * 1.0 / items.size();
        System.out.printf("Average treasure gain: %.2f pirate credits.", avrgGain);
    }
}
