package programmes;

import java.util.Scanner;

/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class P02_MinimumAndMaximum {
    public static void minimumAndMaximum() {
        Scanner scanner = new Scanner(System.in);

        int Min_Num = Integer.MAX_VALUE;
        int Max_Num = Integer.MIN_VALUE;
        boolean first_number = true;

        while (true) {
            System.out.println("Enter number:- ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (first_number) {
                    Max_Num = number;
                    Min_Num = number;
                    first_number = false;
                } else {
                    Min_Num = Math.min(Min_Num, number);
                    Max_Num = Math.max(Max_Num, number);
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
        }

        System.out.println("Minimum number entered: " + Min_Num);
        System.out.println("Maximum number entered: " + Max_Num);

        scanner.close();
    }

    public static void main(String[] args) {
        minimumAndMaximum();
    }
}
