package Fundamentals.Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] toDo = input.split(" ");
            String command = toDo[0];

            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(toDo[1]);
                    boolean yes = numbers.contains(number);
                    if (yes) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    input = scanner.nextLine();
                    break;
                case "Print":
                    if (toDo[1].equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    } else if (toDo[1].equals("odd")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    input = scanner.nextLine();
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                    input = scanner.nextLine();
                    break;
                case "Filter":
                    int checkNumber = Integer.parseInt(toDo[2]);
                    switch (toDo[1]) {
                        case "<":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) < checkNumber) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            input = scanner.nextLine();
                            break;
                        case ">":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) > checkNumber) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            input = scanner.nextLine();
                            break;
                        case ">=":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) >= checkNumber) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            input = scanner.nextLine();
                            break;
                        case "<=":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) <= checkNumber) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            input = scanner.nextLine();
                            break;
                    }
            }
        }
    }
}
