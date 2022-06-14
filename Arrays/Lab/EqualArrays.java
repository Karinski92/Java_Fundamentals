package Fundamentals.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Array1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] Array2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;

        for (int i = 0; i < Array1.length; i++) {

            if (Array1[i] != Array2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }
            sum += Array1[i];
        }

        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}