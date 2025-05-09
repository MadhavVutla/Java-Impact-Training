import java.util.Scanner;
public class StrongNumberFactorial {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static boolean isStrong(int number) {
        int original = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;        
            sum += factorial(digit);        
            number /= 10;               
        }
        return sum == original;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (isStrong(num)) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is NOT a Strong Number.");
        }
        scanner.close();
    }
}

