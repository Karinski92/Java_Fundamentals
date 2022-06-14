package Fundamentals.BasicSyntaxis.Exercises;

import java.util.Scanner;

public class TriangleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= N ; rows++) {
            for (int columns = 1; columns <= rows ; columns++) {
                System.out.print(rows + " ");

            }
            System.out.println();
            
        }

    }
}
