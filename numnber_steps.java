public class numnber_steps {
    public static void main(String[] args) {
        int num = 12345; // Example number
        int steps = 0;

        while (num > 0) {
            num /= 10; // Remove the last digit
            steps++;
        }

        System.out.println("Number of steps to reduce to zero: " + steps);
    }
}
