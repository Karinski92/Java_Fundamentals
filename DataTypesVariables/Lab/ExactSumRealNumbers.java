package Fundamentals.DataTypesVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        BigDecimal sum  = new BigDecimal( "0" );

        for( int i = 1; i <= N; i++ )
        {
            BigDecimal d  = new BigDecimal( scanner.nextLine() );
            sum = sum.add( d );
        }

        System.out.println( sum );
    }
}
