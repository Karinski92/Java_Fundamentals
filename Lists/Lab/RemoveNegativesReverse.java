package Fundamentals.Lists.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i--);
            }
        }
        Collections.reverse(list);
        if (list.size() == 0) {
            System.out.printf("empty");
        } else {
            System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
