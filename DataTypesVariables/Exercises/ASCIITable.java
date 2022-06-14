package Fundamentals.DataTypesVariables.Exercises;

import java.util.Scanner;

public class ASCIITable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int s = Integer.parseInt(scanner.nextLine());
        int e = Integer.parseInt(scanner.nextLine());

        for (int i = s; i <= e ; i++) {
            char ascii = (char) s;
            s = s + 1;
            System.out.printf("%s ", ascii);
        }
    }
}
