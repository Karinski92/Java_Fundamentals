package Fundamentals.Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int leftSum = 0;


        for (int i = 0; i < array.length; i++) {
            int rightSum = 0;
            for (int j = i+1; j < array.length ; j++) {
                rightSum += array[j];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }
            leftSum += array[i];
        }
        System.out.println("no");


    }
}
