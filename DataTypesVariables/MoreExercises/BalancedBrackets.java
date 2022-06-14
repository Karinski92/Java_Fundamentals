package Fundamentals.DataTypesVariables.MoreExercises;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Lines = Integer.parseInt(scanner.nextLine());
        int LeftCount = 0;
        int RightCount = 0;

        while (Lines != 0) {
            String input = scanner.nextLine();
            if (input.length() == 1) {
                char Check = input.charAt(0);
                int ascii = (char) Check;
                if (ascii == 41) {
                    LeftCount++;
                } else if (ascii == 40) {
                    RightCount++;
                }
            }
            Lines = Lines - 1;
        }

        if (LeftCount == RightCount) {
            System.out.printf("BALANCED");
        } else {
            System.out.printf("UNBALANCED");
        }


    }
}
