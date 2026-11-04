package logicbuilding;

import java.util.Scanner;

public class SumOfSquares {
    static int squareSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=Math.pow(i,2);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int squareSum = squareSum(n);
        System.out.println("Sum of squares: " + squareSum(n));
        sc.close();
    }
}
