package logicbuilding;

import java.util.Scanner;

public class SwapTwoNumbers {
    static void swapUsingThird(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers After Swapping Using Third Variable Are " +a + " " + b);
    }

    static void swapWithoutThird(int a, int b) {
        a = a +b;
        b = a -b;
        a = a -b;
        System.out.println("Numbers After Swapping Without Using Third Variable Are " + a + " " + b);
    }

    static void swapUsingBitwiseXOR(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Numbers After Swapping Without Using Bitwise XOR Are " + a + " " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int y = sc.nextInt();

        swapUsingThird(x, y);
        swapWithoutThird(x, y);
        swapUsingBitwiseXOR(x, y);
        sc.close();
    }
}
