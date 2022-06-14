package Fundamentals.DataTypesVariables.Exercises;

import java.util.Scanner;

public class LatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {

                    char firstChar = (char) ('a' + i);
                    char secondChar = (char) ('a' + j);
                    char thirdChar = (char) ('a' + k);

                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);

                }
                
            }
            
        }
    }
}
