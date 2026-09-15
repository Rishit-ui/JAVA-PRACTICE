public class DecimalToBinaryMath {
    public static void main(String[] args) {
        int decimal = 13;

        int binary = 0;
        int rem = 0;
        int placeValue = 1;

        int temp = decimal;

        while (temp > 0) {
            rem = temp % 2;
            binary = binary + (rem * placeValue);
            placeValue = placeValue * 10;
            temp = temp / 2;
        }

        System.out.println("Binary of " + decimal + " is: " + binary);

    }
}
