public class array2sum {

    public static void main(String[] args) {

        int[] arr = { 3, 5, 2, 9, 1 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == 14) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    sum++;
                }
            }
        }

        System.out.println("Total pairs: " + sum);
    }
}