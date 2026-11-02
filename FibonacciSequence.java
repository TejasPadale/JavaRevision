public class FibonacciSequence {
    public static void printFibonacci(int count){
        int n1 = 0, n2 = 1;

        for (int i = 0; i< count; i++){
            System.out.print(n1 + " ") ;

            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
    }
    public static void main(String[] args) {

        int num = 10;
        printFibonacci(num);

    }
}
