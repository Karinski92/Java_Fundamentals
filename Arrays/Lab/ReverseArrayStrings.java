package Fundamentals.Arrays.Lab;

import java.util.Scanner;

public class ReverseArrayStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array = scanner.nextLine().split(" ");
        for (int i = 0; i < array.length/2; i++) {
            String element = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = element;
        }
        System.out.println(String.join(" ", array));
    }
}
