package Fundamentals.BasicSyntaxis.Exercises;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int Fact = 0;
        int sum = 0;
        int n = N;
        while (n != 0) {

            Fact = 1;
            int lastDigit = n % 10;
            for (int i = lastDigit; i >= 1 ; i--)
                Fact = Fact * i;
                sum = sum + Fact;
                n = n / 10;
                

        }
        if (sum == N) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
