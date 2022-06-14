package Fundamentals.DataTypesVariables.Lab;


import java.io.IOException;
import java.util.Scanner;

public class ConcantNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Name1 = scanner.nextLine();
        String Name2 = scanner.nextLine();
        String X = scanner.nextLine();

        System.out.println(Name1 + X + Name2);
    }

}
