package Fundamentals.DataTypesVariables.Lab;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Cent = Double.parseDouble(scanner.nextLine());
        double Years = Cent * 100;
        double days = Years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%.0f centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", Cent, Years, days, hours, minutes);
    }
}
