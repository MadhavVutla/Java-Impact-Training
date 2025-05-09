import java.util.Scanner;

public class ReverseThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int reversedNum = (number % 10) * 100 + ((number / 10) % 10) * 10 + (number / 100);
            System.out.println("Reversed number: " + reversedNum);
        } else {
            System.out.println("Please enter a valid 3-digit number.");
        }
    }
}
