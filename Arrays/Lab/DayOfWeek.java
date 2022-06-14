package Fundamentals.Arrays.Lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] days = {
                "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"
        };
        int Day = Integer.parseInt(scanner.nextLine());

        if (Day >= 1 && Day <= 7) {
            System.out.println(days[Day-1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
