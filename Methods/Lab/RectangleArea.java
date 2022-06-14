package Fundamentals.Methods.Lab;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = Double.parseDouble(sc.nextLine());
        double heighth = Double.parseDouble(sc.nextLine());
        double area = getRectangleArea (width, heighth);
        System.out.printf("%.0f",area);
    }

    public static double getRectangleArea (double width, double height) {
        return width * height;
    }
}
