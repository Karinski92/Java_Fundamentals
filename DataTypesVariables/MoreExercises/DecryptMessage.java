package Fundamentals.DataTypesVariables.MoreExercises;


import java.util.Scanner;

public class DecryptMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Key = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());

        while (N != 0) {
            char L = scanner.next().charAt(0);
            int ascii = (char) L + Key;
            char Decoded = (char) ascii;
            System.out.printf("%s", Decoded);
            N = N - 1;
        }

    }
}


