package Fundamentals.BasicSyntaxis.Lab;

import java.util.Scanner;

public class Back30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Hour = Integer.parseInt(scanner.nextLine());
        int Minutes = Integer.parseInt(scanner.nextLine());
        int NewMinutes = Minutes + 30;
        if (NewMinutes > 59) {
            Hour += 1;
            NewMinutes -= 60;
        }
        if (Hour > 23) {
            Hour = 0;
        }
        if (NewMinutes < 10) {
            System.out.printf("%d:%02d%n", Hour, NewMinutes);
        } else {
            System.out.printf("%d:%d", Hour, NewMinutes);
        }
    }
}
