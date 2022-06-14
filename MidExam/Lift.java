package Fundamentals.MidExam;

import java.util.Arrays;
import java.util.Scanner;


public class Lift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Ppl = Integer.parseInt(scanner.nextLine());
        int[] Carts = Arrays.stream(scanner.nextLine().split(" " ))
                .mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < Carts.length; i++) {

            for (int j = Carts[i]; j <= 4 ; j++) {
                if (Carts[i] < 4 && Ppl > 0){
                    Carts[i]++;
                    Ppl--;
                    if (Carts[i] == 4){
                        break;
                    }
                }

            }

        }
        for (int i = 0; i < Carts.length; i++) {

            if (Ppl == 0 && Carts[i] <= 4) {
                System.out.println("The lift has empty spots!");
                for (int wagon : Carts) {
                    System.out.print(wagon + " " );
                }
                return;
            } else if (Ppl > 0 && Carts[Carts.length - 1] == 4) {
                System.out.printf("There isn't enough space! %d people in a queue!\n", Ppl);
                for (int cart : Carts) {
                    System.out.print(cart + " ");
                }
                return;
            } else if (Ppl == 0 && Carts[Carts.length - 1] == 4) {
                for (int wagon : Carts) {
                    System.out.print(wagon + " ");
                }
                return;
            }
        }


    }
}