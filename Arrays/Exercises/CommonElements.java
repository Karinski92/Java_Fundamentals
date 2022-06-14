package Fundamentals.Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arrayOne = scanner.nextLine().split(" ");
        String [] arrayTwo = scanner.nextLine().split(" ");
        String result = "";

        for (String symbol : arrayTwo) {
            if (Arrays.asList(arrayOne).contains(symbol)) {
                System.out.print(symbol + " ");
            }

        }

    }
}
