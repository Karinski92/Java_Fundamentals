package Fundamentals.DataTypesVariables.MoreExercises;

import java.util.Scanner;

public class LeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= N ; i++) {
            String Row = scanner.nextLine();
            String [] Numbers = Row.split(" ");
            long LN = Long.parseLong(Numbers[0]);
            long RN = Long.parseLong(Numbers[1]);
            long greater = Math.max(LN,RN);
            long sum = 0;

            while (greater != 0) {
                sum += greater % 10;
                greater /= 10;

            }

            System.out.println(Math.abs(sum));


        }
    }
}
