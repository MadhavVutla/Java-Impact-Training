public class lineformat{
    public static void main(String[] args) {
        int number = 2567;
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        while (reversed > 0) {
            int digit = reversed % 10;
            System.out.println(digit);
            reversed = reversed / 10;
        }
    }
}


