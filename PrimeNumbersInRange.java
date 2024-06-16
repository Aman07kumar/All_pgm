import java.util.Scanner;

public class PrimeNumbersInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: starting and ending number
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        // Find and print all prime numbers in the range
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Edge cases: numbers less than 2 are not prime
        if (num < 2) {
            return false;
        }
        // Check for factors from 2 to the square root of num
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
