package Fundamentals.MidExam;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foodKg = Double.parseDouble(scanner.nextLine());
        double hayKg = Double.parseDouble(scanner.nextLine());
        double coverKg = Double.parseDouble(scanner.nextLine());
        double weightKg = Double.parseDouble(scanner.nextLine());

        double foodGram = foodKg * 1000;
        double hayGram = hayKg * 1000;
        double coverGram = coverKg * 1000;
        double weightGram = weightKg * 1000;


        for (int i = 1; i <= 30 ; i++) {
            foodGram -= 300;

            if (i % 2 == 0) {
                hayGram -= foodGram * 0.05;
            }
            if (i % 3 == 0) {
                coverGram -= weightGram / 3;
            }

            }
        if (foodGram <= 0 || hayGram <= 0 || coverGram <= 0){
            System.out.printf("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    foodGram / 1000, hayGram / 1000, coverGram / 1000);
        }
    }
}
