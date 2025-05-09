import java.util.Scanner;
public class PowerRepresentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int exponent = (int) Math.floor(Math.log10(number));
        double base = number / Math.pow(10, exponent);
        System.out.printf("Scientific Notation: %.3f × 10^%d%n", base, exponent);
        System.out.println("\nBinary Power Representation (Base 2):");
        String binary = Integer.toBinaryString(number);
        int len = binary.length();
        StringBuilder powerRepresentation = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (binary.charAt(i) == '1') {
                int power = len - i - 1;
                powerRepresentation.append("2^").append(power).append(" + ");
            }
        }
        if (powerRepresentation.length() > 0) {
            powerRepresentation.setLength(powerRepresentation.length() - 3);
        }
        System.out.println(powerRepresentation);
    }
}
