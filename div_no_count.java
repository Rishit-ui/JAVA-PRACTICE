import java.util.Scanner;

public class div_no_count {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int original = num;
        int count = 0;

        while (num != 0) {

            int x = num % 10;

            if (x != 0 && original % x == 0) {
                count++;
            }

            num = num / 10;
        }

        System.out.println("Count = " + count);

        sc.close();
    }
}