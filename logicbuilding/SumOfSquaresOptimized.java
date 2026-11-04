package logicbuilding;

import java.util.Scanner;

public class SumOfSquaresOptimized {
    static int squareSumOptimized(int n){
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        System.out.println("Sum of squares: " + squareSumOptimized(n));

        sc.close();
    }
}
