import java.util.HashSet;
import java.util.Set;

public class DistinctElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> distinctElements = new HashSet<>();
        for (int num : arr) {
            distinctElements.add(num);
        }
        System.out.println("Distinct elements: " + distinctElements);
    }
}