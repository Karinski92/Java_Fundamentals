package Fundamentals.Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        int [] initialPosition = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] field = new int[fieldSize];

        for (int index : initialPosition) {
            if (index >= 0 && index < fieldSize) {
                field[index] = 1;
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String [] movement = input.split(" ");
            int bugIndex = Integer.parseInt(movement[0]);
            String direction = movement[1];
            int Length = Integer.parseInt(movement[2]);

            if (bugIndex < 0 || bugIndex >= fieldSize || field[bugIndex] != 1) {
                input = scanner.nextLine();
                continue;
            }
            field[bugIndex] = 0;
            switch (direction) {
                case "right":
                    bugIndex += Length;
                    while (bugIndex < fieldSize && field[bugIndex] == 1) {
                        field [bugIndex] += Length;
                    }
                    if (bugIndex < fieldSize) {
                        field[bugIndex] = 1;
                    }
                    break;
                case "left":
                    bugIndex -= Length;
                    while (bugIndex >= 0 && field[bugIndex] == 1) {
                        bugIndex -= Length;
                    }
                    if (bugIndex >= 0) {
                        field[bugIndex] = 1;
                    }

                    break;
            }
        }
        Arrays.stream(field).forEach(e-> System.out.print(e + " "));


    }
}
