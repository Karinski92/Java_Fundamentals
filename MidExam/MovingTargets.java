package Fundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTargets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String [] toDo = input.split("\\s+");
            String command = toDo[0];
            int index = Integer.parseInt(toDo[1]);
            int powerValueRadius = Integer.parseInt(toDo[2]);

            switch (command) {
                case "Shoot":
                    if (index >= 0 && index < targets.size()) {
                        targets.set(index, targets.get(index) - powerValueRadius);
                        if (targets.get(index) <= 0) {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    if (index >= 0 && index < targets.size()) {
                        targets.add(index,powerValueRadius);
                    } else {
                        System.out.printf("Invalid placement!%n");
                    }
                    break;
                case "Strike":
                    int startIndex = index - powerValueRadius;
                    int endIndex = index + powerValueRadius;
                    if (startIndex < 0 || endIndex > targets.size()-1) {
                        System.out.printf("Strike missed!%n");
                    } else {
                        targets.subList(startIndex, endIndex + 1).clear();
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.print(targets.get(0));
        for (int i = 1; i < targets.size() ; i++) {
            System.out.print("|" + targets.get(i));
        }

    }
}
