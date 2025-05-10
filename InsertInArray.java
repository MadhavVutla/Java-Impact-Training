import java.util.Scanner;
public class InsertInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter position to insert (1-based index): ");
        int insertPos = sc.nextInt();
        System.out.print("Enter value to insert: ");
        int insertVal = sc.nextInt();
        if (insertPos < 1 || insertPos > size + 1) {
            System.out.println("Invalid position!");
            return;
        }
        int[] newArr = new int[size + 1];
        for (int i = 0; i < insertPos - 1; i++) {
            newArr[i] = arr[i];
        }
        newArr[insertPos - 1] = insertVal;
        for (int i = insertPos - 1; i < size; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.print("Array after insertion: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}