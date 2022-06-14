package Fundamentals.Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (firstHand.size() > 0 && secondHand.size() > 0) {
            int firstPlayerCard = firstHand.remove(0);
            int secondPlayerCard = secondHand.remove(0);

            if(firstPlayerCard > secondPlayerCard) {
                firstHand.add(firstPlayerCard);
                firstHand.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondHand.add(secondPlayerCard);
                secondHand.add(firstPlayerCard);
            } else {
                continue;
            }
        }
        int sum = 0;
        String Winner = "";
        if (firstHand.size() > 0) {
            for (int card : firstHand) {
                sum += card;
                Winner = "First player";
            }
        } else if (secondHand.size() > 0) {
            for (int card : secondHand) {
                sum += card;
                Winner = "Second player";
            }
        }
        System.out.printf("%s wins! Sum: %d", Winner, sum);



    }
}
