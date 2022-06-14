package Fundamentals.Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        int size = numbers.size();
        for (int i = 0; i < size/2; i++) {
            numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
            numbers.remove(numbers.size() - 1);
        }
        for (int i = 0; i < numbers.size() - 1; i++) {
            System.out.printf("%.0f ",numbers.get(i));
        }
        System.out.printf("%.0f", numbers.get(numbers.size()-1));
    }
}
