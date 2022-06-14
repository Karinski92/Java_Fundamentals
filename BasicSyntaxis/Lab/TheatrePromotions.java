package Fundamentals.BasicSyntaxis.Lab;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Day = scanner.nextLine();
        int Age = Integer.parseInt(scanner.nextLine());
        int TicketCost = 0;
        if (Day.equals("Weekday")) {
            if ((Age >= 0 && Age <=18) || (Age > 64 && Age <= 122)) {
                TicketCost = 12;
            } else if (Age > 18 && Age <= 64) {
                TicketCost = 18;
            }
        } else if (Day.equals("Weekend")) {
            if ((Age >= 0 && Age <= 18) || (Age > 64 && Age <= 122)){
                TicketCost = 15;
            } else if (Age > 18 && Age <= 64) {
                TicketCost = 20;
            }
        } else if (Day.equals("Holiday")) {
            if (Age >= 0 && Age <= 18) {
                TicketCost = 5;
            } else if (Age > 18 && Age <= 64) {
                TicketCost = 12;
            } else if (Age > 64 && Age <= 122) {
                TicketCost = 10;
            }
        }
        if (TicketCost != 0) {
            System.out.println(TicketCost + "$");
        } else {
            System.out.println("Error!");
        }
    }
}
