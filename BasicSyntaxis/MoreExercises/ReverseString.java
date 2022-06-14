package Fundamentals.BasicSyntaxis.MoreExercises;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String Word = scanner.nextLine();

        char[] L = Word.toCharArray();

        for (int i = L.length -1; i >= 0  ; i--) {
            System.out.print(L[i]);
            
        }
    }
}
