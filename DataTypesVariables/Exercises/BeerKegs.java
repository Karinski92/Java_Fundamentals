package Fundamentals.DataTypesVariables.Exercises;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        double Max = Double.MIN_VALUE;
        String MaxKeg = "";

        for (int i = 0; i < N; i++) {
            String Model = scanner.nextLine();
            double Radius = Double.parseDouble(scanner.nextLine());
            int Height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(Radius,2) * Height;

            if (volume > Max) {
                MaxKeg = Model;
                Max = volume;
            }

        }
        System.out.println(MaxKeg);

    }
}
