package Fundamentals.Methods.Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        double number = Double.parseDouble(sc.nextLine());

        switch (product) {
            case "water":
                water(number);
                break;
            case "coffee":
                coffee(number);
                break;
            case "coke":
                coke(number);
                break;
            case "snacks":
                snacks(number);
                break;
        }

    }

    public static void water (double number) {
        System.out.printf("%.2f",number*1);
    }
    public static void coffee (double number) {
        System.out.printf("%.2f",number*1.5);
    }
    public static void coke (double number) {
        System.out.printf("%.2f", number*1.4);
    }
    public static void snacks (double number) {
        System.out.printf("%.2f",number*2);
    }

}
