import java.util.Scanner;

public class stringInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("length : " + name.length());
        System.out.println("uppercase : " + name.toUpperCase());
        System.out.println("lowercase : " + name.toLowerCase());
        System.out.println("Hello, " + name + "!");

    }

}
