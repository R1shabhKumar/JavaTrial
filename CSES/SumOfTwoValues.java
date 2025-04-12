import java.util.Scanner;

public class SumOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println((i + 1) + " " + (j + 1));
                    return;
                }
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}
