package Fundamentals.Arrays.MoreExercises;

import java.util.Scanner;

public class EncryptSortPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strings = Integer.parseInt(scanner.nextLine());
        String [] input = new String[strings];
        int [] sort = new int[strings];
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < strings; i++) {
            input [i] = scanner.nextLine();
        }
        for (int i = 0; i < strings; i++) {
            char [] encrypt = input[i].toCharArray();
            int sumVowel = 0;
            int sumConsonant = 0;

            for (int j = 0; j < encrypt.length; j++) {
                String currentChar = String.valueOf(encrypt[j]);
                if (vowels.contains(currentChar)) {
                    sumVowel = sumVowel + (encrypt[j] * (input[i].length()));
                } else {
                    sumConsonant = sumConsonant + (encrypt[j] / (input[i].length()));
                }
            }
            sort[i] = sumVowel + sumConsonant;
        }
        for (int i = 0; i < strings; i++) {
            for (int j = 0; j < strings; j++) {
                int tempSort;
                if (sort[i] > sort[j]) {
                    tempSort = sort[i];
                    sort[i] = sort[j];
                    sort[j] = tempSort;
                }
            }
        }
        for (int i = 0; i < strings; i++) {
            System.out.println(sort[i]);
            
        }

    }
}
