package Fundamentals.DataTypesVariables.MoreExercises;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();

        while (!N.equals("END")) {
            Scanner input = new Scanner(N);
            if (input.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n", N);
            } else if (input.hasNextInt()) {
                System.out.printf("%s is integer type%n", N);
            } else if (input.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", N);
            } else if (N.length() == 1) {
                System.out.printf("%s is character type%n", N);
            } else if(input.hasNextLine()) {
                System.out.printf("%s is string type%n", N);
            }
            N = scanner.nextLine();

        }

    }
}
