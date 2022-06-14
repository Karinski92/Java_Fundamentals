package Fundamentals.Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class LIS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] lisLength = new int[numbers.length];
        int[] lisPrevIndex = new int[numbers.length];

        for (int i = 0; i < lisLength.length; i++) {
            lisLength[i] = 1;
            lisPrevIndex[i] = -1;
        }
        for (int lastIndex = 1; lastIndex < numbers.length; lastIndex++) {
            for (int prevIndex = 0; prevIndex < lastIndex; prevIndex++) {
                if (numbers[prevIndex] < numbers[lastIndex]) {
                    int candidateLength = lisLength[prevIndex] + 1;
                    if (candidateLength > lisLength[lastIndex]) {
                        lisLength[lastIndex] = candidateLength;
                        lisPrevIndex[lastIndex] = prevIndex;
                    }
                }
            }
        }
        int maxLength = 0;
        int maxLengthIndex = -1;
        for (int i = 0; i < lisLength.length; i++) {
            if (lisLength[i] > maxLength) {
                maxLength = lisLength[i];
                maxLengthIndex = i;
            }
        }
        int Index = maxLengthIndex;
        int [] LIS = new int[maxLength];
        int position = maxLength;
        while (Index != -1) {
            LIS[position-1] = numbers[Index];
            Index = lisPrevIndex[Index];
            position --;
        }

        for (int number : LIS) {
            System.out.print(number + " ");
        }
    }
}
