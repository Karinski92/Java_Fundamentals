package Fundamentals.DataTypesVariables.Exercises;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        double MaxValue = Double.MIN_VALUE;
        int BestSnow = 0;
        int BestTime = 0; ;
        int BestQuality = 0;

        for (int i = 0; i < N; i++) {
            int Snow = Integer.parseInt(scanner.nextLine());
            int Time = Integer.parseInt(scanner.nextLine());
            int Quality = Integer.parseInt(scanner.nextLine());

            double Value = Math.pow((Snow/Time), Quality);

            if (Value > MaxValue) {
                BestSnow = Snow;
                BestTime = Time;
                BestQuality = Quality;
                MaxValue = Value;

            }

        }
        System.out.printf("%d : %d = %.0f (%d)", BestSnow, BestTime, MaxValue, BestQuality);
    }
}
