public class AdamNumberCheck {
    static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int number = 12;  
        int square = number * number;
        int reversedNumber = reverse(number);
        int reversedSquare = reverse(reversedNumber * reversedNumber);
        if (square == reversedSquare) {
            System.out.println(number + " is an Adam number.");
        } else {
            System.out.println(number + " is NOT an Adam number.");
        }
    }
}
