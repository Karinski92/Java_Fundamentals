package Fundamentals.BasicSyntaxis.Lab;

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        int Age = Integer.parseInt(scanner.nextLine());
        double Grade = Double.parseDouble(scanner.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f", Name, Age, Grade);
    }
}
