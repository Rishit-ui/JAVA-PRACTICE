import java.util.Scanner;

public class dec_to_binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String decimalInput = scanner.nextLine();
        int decimal = Integer.parseInt(decimalInput);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
    }
}
