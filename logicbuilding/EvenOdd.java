package logicbuilding;

import java.util.Scanner;

public class EvenOdd {
    public static boolean evenOdd(int n){
        if(n%2==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(evenOdd(n)){
            System.out.println("Even");
        }else  {
            System.out.println("Odd");
        }
    }
}
