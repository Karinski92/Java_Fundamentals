package Fundamentals.Arrays.Exercises;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWagons = Integer.parseInt(scanner.nextLine());
        int [] ppl = new int[countWagons];
        int sum = 0;
        for (int i = 0; i < countWagons; i++) {
            ppl[i] = Integer.parseInt(scanner.nextLine());
            sum += ppl[i];
            System.out.print(ppl[i] + " ");
        }
        System.out.printf("%n%d",sum);


    }
}
