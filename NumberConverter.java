import java.util.Scanner;

public class NumberConverter {
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Decimal to Binary conversion
        System.out.print("Enter a decimal number to convert to binary: ");
        int decimalInput = scanner.nextInt();
        String binaryResult = decimalToBinary(decimalInput);
        System.out.println("Binary representation: " + binaryResult);

        // Binary to Decimal conversion
        System.out.print("Enter a binary number to convert to decimal: ");
        String binaryInput = scanner.next();
        int decimalResult = binaryToDecimal(binaryInput);
        System.out.println("Decimal representation: " + decimalResult);
    }
}
