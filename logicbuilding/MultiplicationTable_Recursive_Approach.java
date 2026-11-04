package logicbuilding;

import java.util.Scanner;

public class MultiplicationTable_Recursive_Approach {
    static void printTable(int n, Integer... val)  {
        int i = 1;
        if (val.length != 0)
            i = val[0];
        if (i == 11)
            return;
        System.out.println(n + " * " + i + " = " + n * i);
        i++;
        printTable(n, i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        printTable(n);
        sc.close();
    }
}
