package Fundamentals.Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String [] commands = input.split(" ");
            String order = commands[0];
            int number = Integer.parseInt(commands[1]);

                switch (order) {
                    case "Add":
                        numbers.add(numbers.size(), number);
                        break;
                    case "Remove":
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) == number) {
                                numbers.remove(i);
                            }
                        }
                        break;
                    case "RemoveAt":
                        numbers.remove(number);
                        break;
                    case "Insert":
                        int index = Integer.parseInt(commands[2]);
                        numbers.add(index, number);
                        break;
                }
                input = scanner.nextLine();
            }
        for (int N : numbers) {
            System.out.print(N + " ");
        }

    }
}
