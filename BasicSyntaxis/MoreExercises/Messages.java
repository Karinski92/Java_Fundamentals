package Fundamentals.BasicSyntaxis.MoreExercises;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int TapTimes = Integer.parseInt(scanner.nextLine());
        String Message = "";

        for (int i = 0; i < TapTimes; i++) {
            String Number = scanner.nextLine();
            int Length = Number.length();
            char Digit = Number.charAt(0);
            int MainDigit = Character.getNumericValue(Digit);
            int Offset = (MainDigit - 2) * 3;

            if (MainDigit == 8 || MainDigit == 9) {
                Offset = ((MainDigit - 2) * 3) + 1;
            }

            int LIndex = Offset + Length -1;
            int Code = LIndex + 97;

            char Letter = (char) Code;
            if (MainDigit == 0) {
                Letter = (char) (MainDigit +32);
            }
            Message += Letter;
            
        }
        System.out.println(Message);


    }
}
