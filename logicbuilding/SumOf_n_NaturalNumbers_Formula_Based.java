package logicbuilding;

import java.util.Scanner;

public class SumOf_n_NaturalNumbers_Formula_Based {
    static long calculateSum(long n) {
        // Using long prevents integer overflow for large values of n
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        long n = sc.nextLong();

        System.out.println("Sum: " + calculateSum(n));
        sc.close();
    }
}
