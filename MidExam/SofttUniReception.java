package Fundamentals.MidExam;

import java.util.Scanner;

public class SofttUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int efficiency1 = Integer.parseInt(scanner.nextLine());
        int efficiency2 = Integer.parseInt(scanner.nextLine());
        int efficiency3 = Integer.parseInt(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());

        int studentsPerHour = efficiency1 + efficiency2 + efficiency3;
        int hours = 0;

        if (studentCount % studentsPerHour == 0) {
            hours = studentCount / studentsPerHour;
        } else {
            hours = studentCount / studentsPerHour + 1;
        }

        if (hours > 3) {
            hours += hours / 3;
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}
