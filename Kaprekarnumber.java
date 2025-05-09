import java.util.Scanner;
public class Kaprekarnumber{
    public static String isKaprekar(int n) {
        int square = n * n;
        int numDigits = (int) Math.log10(n) + 1;
        int rightPart = square % (int) Math.pow(10, numDigits);
        int leftPart = square / (int) Math.pow(10, numDigits);
        if (leftPart == 0) {
            leftPart = 0;
        }
        if (leftPart + rightPart == n) {
            return "Kaprekar Number";
        } else {
            return "Not a Kaprekar Number";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(isKaprekar(num));
        scanner.close();
    }
}