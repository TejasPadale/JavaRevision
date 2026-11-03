package logicbuilding;

import java.util.Scanner;

public class EvenOddBitwise {
    public static boolean bitwiseEvenOdd(int num) {
        if( (num & 1) == 0){
            return true;
        }else  {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(bitwiseEvenOdd(n)){
            System.out.println("Even");
        }else  {
            System.out.println("Odd");
        }
    }
}
