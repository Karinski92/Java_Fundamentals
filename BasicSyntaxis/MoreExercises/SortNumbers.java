package Fundamentals.BasicSyntaxis.MoreExercises;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        int N3 = Integer.parseInt(scanner.nextLine());

        int MIN = 0;
        int MID = 0;
        int MAX = 0;

        if (N1 > N2 && N1 > N3) {
            MAX = N1;
            if (N2 < N3) {
                MIN = N2;
                MID = N3;
            } else {
                MIN = N3;
                MID = N2;
            }
        }
        if (N2 > N1 && N2 > N3) {
            MAX = N2;
            if (N1 < N3) {
                MIN = N1;
                MID = N3;
            } else {
                MIN = N3;
                MID = N1;
            }
        }
        if (N3 > N1 && N3 > N2) {
            MAX = N3;
            if (N1 < N2) {
                MIN = N1;
                MID = N2;
            } else {
                MIN = N2;
                MID = N1;
            }
        }
        System.out.printf("%d%n%d%n%d%n", MAX, MID, MIN);





    }
}
