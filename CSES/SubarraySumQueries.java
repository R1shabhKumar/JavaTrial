import java.util.Scanner;

public class SubarraySumQueries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        for (int i = 0; i < m; i++) {
            int k = scanner.nextInt();
            long x = scanner.nextLong();
            arr[k - 1] = x;
            System.out.println(fxn(arr));
        }
        scanner.close();
    }

    public static long fxn(long[] arr) {
        long max = 0;
        long curr = 0;
        for (long num : arr) {
            curr += num;
            if (curr < 0) {
                curr = 0;
            }
            if (curr > max) {
                max = curr;
            }
        }
        return max;
    }
}
