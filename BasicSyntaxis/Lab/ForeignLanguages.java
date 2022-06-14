package Fundamentals.BasicSyntaxis.Lab;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Country = scanner.nextLine();
        if (Country.equals("USA") || Country.equals("England")) {
            System.out.printf("English");
        } else if (Country.equals("Spain") || Country.equals("Argentina") || Country.equals("Mexico")) {
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }
    }
}

