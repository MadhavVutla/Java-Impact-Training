import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.matches("\\d{4}")) {
            System.out.println("Valid four-digit number!");
        } else {
            System.out.println("Not a four-digit number!");
        }

    }
}
