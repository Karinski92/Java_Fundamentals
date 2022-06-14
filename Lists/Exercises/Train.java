package Fundamentals.Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String [] toDo = input.split(" ");
            if (toDo[0].equals("Add")) {
                int newWagon = Integer.parseInt(toDo[1]);
                wagons.add(wagons.size(), newWagon);
            } else {
                int ppl = Integer.parseInt(toDo[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) < maxCapacity && (maxCapacity- wagons.get(i)) >= ppl) {
                        wagons.set(i, wagons.get(i) + ppl);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < wagons.size(); i++) {
            System.out.print(new StringBuilder().append(wagons.get(i)).append(" ").toString());

        }
    }
}
