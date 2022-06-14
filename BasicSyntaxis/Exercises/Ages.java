package Fundamentals.BasicSyntaxis.Exercises;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Age = Integer.parseInt(scanner.nextLine());
        if (Age >= 0 && Age <= 2) {
            System.out.printf("baby");
        } else if (Age >= 3 && Age <= 13) {
            System.out.printf("child");
        } else if (Age >= 14 && Age <= 19) {
            System.out.printf("teenager");
        } else if (Age >= 20 && Age <= 65) {
            System.out.printf("adult");
        } else if (Age >= 66) {
            System.out.printf("elder");
        }
    }
}
