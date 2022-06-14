package Fundamentals.MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double average = sum * 1.0 / numbers.size();
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > average) {
                output.add(numbers.get(i));
            }
        }
        if (output.isEmpty()) {
            System.out.printf("No");
        } else {
        Collections.sort(output);
        if (output.size() > 5){
            for (int i = output.size()-1; i > output.size()-6; i--) {
                System.out.print(output.get(i) + " ");
            }
        } else {
            for (int i = output.size() - 1; i >= 0; i--) {
                System.out.print(output.get(i) + " ");
            }
        }
        }

    }
}
