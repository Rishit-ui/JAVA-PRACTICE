public class pushzeroesend {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 3, 0, 4, 0, 5 };
        int count = 0; // Count of non-zero elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }

        // Print the modified array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
