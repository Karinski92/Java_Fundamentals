package Fundamentals.Methods.Lab;

import java.util.Scanner;

public class GreaterValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        switch (type) {
            case "int":
                System.out.println(getMax(first,second));
                break;
            case "char":
                System.out.println(getMax(first,second));
                break;
            case "string":
                System.out.println(getMax(first,second));
                break;
        }

    }
    static char getMax (char first, char second){
        char bigger = first;
        if (first < second) {
            bigger = second;
        }
        return bigger;
    }

    static String getMax (String first, String second) {
        String bigger = "";
        if (first.length() > second.length()) {
            bigger = first;
        } else {
            bigger = second;
        }
        return bigger;
    }

    static int getMax (int first, int second) {
        int bigger = first;
        if (first < second) {
            bigger = second;
        }
        return bigger;
    }
}
