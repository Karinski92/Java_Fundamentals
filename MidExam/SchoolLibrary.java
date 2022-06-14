package Fundamentals.MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shelf = Arrays.stream(scanner.nextLine().split("\\&+")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!"Done".equals(input)) {
            String [] toDo = input.split("\\|+");
            String command = toDo[0].trim();

            switch (command) {
                case "Add Book":
                    if (!shelf.contains(toDo[1].trim())) {
                        shelf.add(0, toDo[1].trim());
                    }

                    break;
                case "Take Book":
                    if (shelf.contains(toDo[1].trim())) {
                        shelf.remove(toDo[1].trim());
                    }

                    break;
                case "Swap Books":
                    if (shelf.contains(toDo[1].trim()) && shelf.contains(toDo[2].trim())) {
                        Collections.swap(shelf, shelf.indexOf(toDo[1].trim()), shelf.indexOf(toDo[2].trim()));
                    }

                    break;
                case "Insert Book":
                    if (!shelf.contains(toDo[1].trim())) {
                        shelf.add(toDo[1].trim());
                    }

                    break;
                case "Check Book":
                    int index = Integer.parseInt(toDo[1].trim());
                    if (index >= 0 && index < shelf.size()) {
                        System.out.printf("%s%n",shelf.get(index));
                    }

                    break;
            }
            input = scanner.nextLine();
        }
        System.out.print(shelf.get(0));
        for (int i = 1; i < shelf.size() ; i++) {
            System.out.print(", " + shelf.get(i));

        }

    }
}
