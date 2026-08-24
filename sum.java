public class sum {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
            System.out.println("Sum of first " + i + " natural numbers: " + sum);
        }
    }

}
