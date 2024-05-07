package programmes;
/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 */

import java.util.Scanner;

public class P06_TriangleNumber {
    public static void triangleNumber(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after printing numbers
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        triangleNumber(rows);
        scanner.close();
    }
}
