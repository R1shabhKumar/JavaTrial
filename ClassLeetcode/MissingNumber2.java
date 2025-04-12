import java.util.Arrays;
import java.util.Scanner;

class MissingNumber2 {
    public static int fxn(int n, int[] nums) {

        long expectedSum = (long) n * (n + 1) / 2;


        long Sum = 0;
        for (int num : nums) {
            Sum += num;
        }


        return (int) (expectedSum - Sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            nums[i] = scanner.nextInt();
        }
        int missing = fxn(n, nums);
        System.out.println(missing);
        scanner.close();
    }
}
