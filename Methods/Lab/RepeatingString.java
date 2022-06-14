package Fundamentals.Methods.Lab;

import java.util.Scanner;

public class RepeatingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int repeat = Integer.parseInt(sc.nextLine());
        System.out.println(repeatString(string, repeat));
    }

    private static String repeatString(String string, int repeat) {
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result += string;
        }
        return (result);
    }
}

