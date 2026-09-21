import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int a = Sc.nextInt();
        int b = Sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
