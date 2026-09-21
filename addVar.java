public class addVar {

    // 1. The add method sits directly inside the class
    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // 2. The main method also sits directly inside the class
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Calling the add method
        int result = add(a, b);

        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }
}
