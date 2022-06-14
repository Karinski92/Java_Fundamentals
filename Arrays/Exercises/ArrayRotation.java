package Fundamentals.Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e-> Integer.parseInt(e)).toArray();
        int step = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < step; i++) {
            int temp = array[0];
            for (int j = 0; j < array.length-1; j++) {
                array[j] = array[j+1];
            }
            array[array.length-1] = temp;
            
        }
        for (int symbol : array) {
            System.out.print(symbol + " ");
        }

    }
}
