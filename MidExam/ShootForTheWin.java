package Fundamentals.MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        int shotTargets = 0;

        while (!input.equals("End")) {
            int shotIndex = Integer.parseInt(input);
            if (shotIndex <= targets.length-1) {
                int tempTarget = targets[shotIndex];
                targets[shotIndex] = -1;
                shotTargets ++;
                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] != -1 && targets[i] > tempTarget) {
                        targets[i] -= tempTarget;
                    } else if (targets[i] != -1 && targets[i] <= tempTarget) {
                        targets[i] += tempTarget;
                    }

                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shotTargets);
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }
}