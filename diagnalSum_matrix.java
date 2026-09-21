public class diagnalSum_matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // summing the diagonal elements
        }

        System.out.println("The sum of the diagonal elements in the matrix is: " + sum);
    }
}
