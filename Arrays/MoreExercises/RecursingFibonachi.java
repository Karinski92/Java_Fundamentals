package Fundamentals.Arrays.MoreExercises;

import java.util.Scanner;

public class RecursingFibonachi {
    public static long fibonacci (long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(fibonacci(fNumber));

    }
}
