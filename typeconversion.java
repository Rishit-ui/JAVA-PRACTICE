public class typeconversion {
    public static void main(String[] args) {
        // byte b = 10;
        int a = 127;
        byte k = (byte) a; // Explicit type casting from int to byte

        float f = 10.5f;
        int t = (int) f; // Explicit type casting from float to int

        System.out.println("Value of k: " + k); // Output will be 127
        System.out.println("Value of t: " + t); // Output will be 10

    }
}

// explicit means larger value to smaller
