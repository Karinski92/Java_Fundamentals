package Fundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> neighbourhood = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int cupidPosition = 0;
        int housesWithValentine = 0;

        while(!input.equals("Love!")) {
            String [] toDo = input.split("\\s+");
            int jump = Integer.parseInt(toDo[1]);
            cupidPosition += jump;
            if (cupidPosition >= neighbourhood.size()) {
                cupidPosition = 0;
            }
            neighbourhood.set(cupidPosition, neighbourhood.get(cupidPosition)-2);
            if (neighbourhood.get(cupidPosition) == 0) {
                System.out.printf("Place %d has Valentine's day.%n", cupidPosition);
                housesWithValentine ++;
            } else if (neighbourhood.get((cupidPosition)) < 0) {
                System.out.printf("Place %d already had Valentine's day.%n", cupidPosition);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", cupidPosition);
        if (housesWithValentine == neighbourhood.size()) {
            System.out.printf("Mission was successful.%n");
        } else {
            System.out.printf("Cupid has failed %d places.%n", neighbourhood.size()-housesWithValentine);
        }


    }
}
