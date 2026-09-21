public class rev_dignolSum {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 6 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i]; // summing the reverse diagonal elements
        }

        System.out.println("The sum of the reverse diagonal elements in the matrix is: " + sum);
    }
}
