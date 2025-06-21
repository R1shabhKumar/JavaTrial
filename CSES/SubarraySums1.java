import java.util.Scanner;

public class SubarraySums1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long x = scanner.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(fxn(n, x, a));
        scanner.close();
    }
    public static int fxn(int n, long target, int[] a) {
        int count = 0;
        long curr = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            curr += a[right];
            while (curr > target) {
                curr -= a[left];
                left++;
            }
            if (curr == target) {
                count++;
            }
        }
        return count;
    }
}
