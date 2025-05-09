public class NearestInteger {
    public static int nearestDivisible(int num, int m) {
        int lower = (num / m) * m;
        int upper = lower + m;
        if (num % m == 0) {
            return num;
        }
        if ((num - lower) < (upper - num)) {
            return lower;
        } else {
            return upper;
        }
    }

    public static void main(String[] args) {
        int num = 35;
        int m = 10;
        System.out.println("Nearest number to " + num + " divisible by " + m + " is: " + nearestDivisible(num, m));
    }
}