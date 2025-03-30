import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {

    // ✅ Method to reverse the array
    private static void reverse(int[] array) {
        System.out.println("\nOriginal array: " + Arrays.toString(array));

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    // ✅ Main method to run the program
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input array size
        int size;
        do {
            System.out.print("Enter array size (positive integer): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next();
            }
            size = scanner.nextInt();
        } while (size <= 0);

        int[] numbers = new int[size];

        // Input array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
        }

        // Reverse the array
        reverse(numbers);

        // Close the scanner
        scanner.close();
    }
}
