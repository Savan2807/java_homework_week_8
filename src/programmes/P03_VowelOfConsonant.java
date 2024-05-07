package programmes;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class P03_VowelOfConsonant {
    public static void alphabet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        char userinput = scanner.next().charAt(0); // Read only the first character of the input
        if (Character.isLetter(userinput)) {  // Check if the input is a letter
            userinput = Character.toLowerCase(userinput);  // Convert the input to lowercase for easier comparison

            // Check if the input is a vowel
            if (userinput == 'a' || userinput == 'e' || userinput == 'i' || userinput == 'o' || userinput == 'u') {
                System.out.println("Input letter is Vowel ");
            } else {
                System.out.println("Input letter is Consonant ");
            }
        } else {
            System.out.println("Error: Input is not a letter. ");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        alphabet();
    }
}

