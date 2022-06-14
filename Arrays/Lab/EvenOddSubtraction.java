package Fundamentals.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int EvenSum = 0;
        int OddSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                EvenSum += numbers[i];
            } else {
                OddSum += numbers[i];
            }

        }
        System.out.println(EvenSum-OddSum);
    }
}
