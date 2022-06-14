package Fundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sequence = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();
        int numberMoves = 0;

        while (!input.equals("end") && sequence.size() != 0) {
            String [] indexes = input.split("\\s+");
            int index1 = Integer.parseInt(indexes[0]);
            int index2 = Integer.parseInt(indexes[1]);
            numberMoves ++;

            if (index1 == index2 || index1 > sequence.size() || index2 > sequence.size() || index1 < 0 || index2 < 0) {
                System.out.printf("Invalid input! Adding additional elements to the board%n");
                int indexForAdding = sequence.size() / 2;
                sequence.add(indexForAdding,"-" + numberMoves + "a");
                sequence.add(indexForAdding,"-" + numberMoves + "a");
            } else {
                if (sequence.get(index1).equals(sequence.get(index2))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", sequence.get(index1));
                    String toRemove1 = sequence.get(index1);
                    String toRemove2 = sequence.get(index2);
                    sequence.remove(toRemove1);
                    sequence.remove(toRemove2);
                } else {
                    System.out.printf("Try again!%n");
                }
            }
            input = scanner.nextLine();
        }
        if (sequence.size() > 0) {
            System.out.printf("Sorry you lose :(%n");
            sequence.forEach(element -> System.out.print(element + " "));
            } else {
            System.out.printf("You have won in %d turns!", numberMoves);
        }
    }
}
