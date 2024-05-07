package programmes;

import java.util.Scanner;

/**
 *  Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class P09_FibonacciNumber {
    // Create a method
    public static void fibonacciNumber(int n) {
        int first = 1;
        int second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        fibonacciNumber(n);
        scanner.close();
    }
}
