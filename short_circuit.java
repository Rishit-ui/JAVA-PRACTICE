public class short_circuit {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // Short-circuit evaluation
        if (b != 0 && (a / b) > 1) {
            System.out.println("Result: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero or condition not met.");
        }
    }
}