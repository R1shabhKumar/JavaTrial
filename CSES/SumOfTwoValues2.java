import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwoValues2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int complement = sum - arr[i];
            if (numMap.containsKey(complement)) {
                System.out.println((numMap.get(complement) + 1) + " " + (i + 1));
                return;
            }
            numMap.put(arr[i], i);
        }


        System.out.println("IMPOSSIBLE");
    }
}
