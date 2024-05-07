package programmes;

/**
 * 8. Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class P08_RightAngleTriangle {
    public static void rightAngleTriangle () {
        for (int i = 1; i <= 5; i++) {
            // Inner loop to print '@' characters
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rightAngleTriangle();
    }
}
