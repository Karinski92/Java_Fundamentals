package Fundamentals.MidExam;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberStudents = Integer.parseInt(scanner.nextLine());
        int numberLectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());
        int maxAttendance = 0;
        double totalBonus = 0;
        double maxBonus = 0;
        for (int i = 0; i < numberStudents; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());

            totalBonus = (attendance * 1.0 /numberLectures * (5 + bonus));
            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                maxAttendance = attendance;
            }
        }
        System.out.printf("Max Bonus: %.0f.%nThe student has attended %d lectures.", maxBonus, maxAttendance);

    }
}
