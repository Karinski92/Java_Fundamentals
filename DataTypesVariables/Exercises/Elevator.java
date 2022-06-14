package Fundamentals.DataTypesVariables.Exercises;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int courses = 0;

        if (n % p == 0) {
            courses = n / p;
        } else {
            courses = n / p + 1;
        }

        System.out.println(courses);
    }
}
