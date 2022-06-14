package Fundamentals.BasicSyntaxis.MoreExercises;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double StartBudget = Double.parseDouble(scanner.nextLine());
        String Game = scanner.nextLine();

        double OutFall = 39.99;
        double CS = 15.99;
        double Zplinter = 19.99;
        double Honored = 59.99;
        double Rover = 29.99;
        double RoverW = 39.99;

        double TC = 0;
        double Budget = StartBudget;


        while (!Game.equals("Game Time")) {

            if (Game.equals("OutFall 4")) {
                if (Budget >= OutFall) {
                    System.out.printf("Bought OutFall 4%n");
                    Budget -= OutFall;
                    TC += OutFall;
                    if (Budget == 0) {
                        System.out.printf("Out of money!%n");
                        break;
                    }
                } else {
                    System.out.printf("Too Expensive%n");
                }
            } else if (Game.equals("CS: OG")) {

                if (Budget >= CS) {
                    System.out.printf("Bought CS: OG%n");
                    Budget -= CS;
                    TC += CS;
                    if (Budget == 0) {
                        System.out.printf("Out of money!%n");
                        break;
                    }
                } else {
                    System.out.printf("Too Expensive%n");
                }
            } else if (Game.equals("Zplinter Zell")) {
                if (Budget >= Zplinter) {
                    System.out.printf("Bought Zplinter Zell%n");
                    Budget -= Zplinter;
                    TC += Zplinter;
                    if (Budget == 0) {
                        System.out.printf("Out of money!%n");
                        break;
                    }
                } else {
                    System.out.printf("Too Expensive%n");
                }
            } else if (Game.equals("Honored 2")) {
                if (Budget >= Honored) {
                    System.out.printf("Bought Honored 2%n");
                    Budget -= Honored;
                    TC += Honored;
                    if (Budget == 0) {
                        System.out.printf("Out of money!%n");
                        break;
                    }
                } else {
                    System.out.printf("Too Expensive%n");
                }
            } else if (Game.equals("RoverWatch")) {
                if (Budget >= Rover) {
                    System.out.printf("Bought RoverWatch%n");
                    Budget -= Rover;
                    TC += Rover;
                    if (Budget == 0) {
                        System.out.printf("Out of money!%n");
                        break;
                    }
                } else {
                    System.out.printf("Too Expensive%n");
                }
            } else if (Game.equals("RoverWatch Origins Edition")) {
                if (Budget >= RoverW) {
                    System.out.printf("Bought RoverWatch Origins Edition%n");
                    Budget -= RoverW;
                    TC += RoverW;
                    if (Budget == 0) {
                        System.out.printf("Out of money!%n");
                        break;
                    }
                } else {
                    System.out.printf("Too Expensive%n");
                }
            } else {
                System.out.printf("Not Found%n");
            }
            Game = scanner.nextLine();

            }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", TC, StartBudget-TC);

    }
}
