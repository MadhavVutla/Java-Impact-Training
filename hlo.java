// import java.util.*;
// public class hlo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers: ");
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         int special = (num1 > num2) ? num1 : num2;
//         System.out.println("The special number is: " + special);
//     }
// }



import java.util.*;
public class hlo {
    public static boolean isSpecial(int num) {
        int sum = 0, prod = 1;
        for (int n = num; n > 0; n /= 10) {
            int d = n % 10;
            sum += d;
            prod *= d;
        }
        return sum + prod == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (isSpecial(a)) 
        System.out.println("The special number is: " + a);
        else if (isSpecial(b)) 
        System.out.println("The special number is: " + b);
        else System.out.println("No special number found");
    }
}
