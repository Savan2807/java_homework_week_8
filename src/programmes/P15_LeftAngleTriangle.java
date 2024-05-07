package programmes;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class P15_LeftAngleTriangle {
    public static void leftAngleTriangle() {
        for (int i = 1; i <= 5; i++) {
            // Print spaces before the asterisks
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }

            // Print the asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        leftAngleTriangle();
    }
}