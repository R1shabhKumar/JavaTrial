import java.util.Arrays;
import java.util.Scanner;

public class DiceCombinations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fxnTabulation(n));
    }

    static int fxn(int n) {
        if (n == 0) return 1;
        int count = 0;
        for (int i = 1; i <= 6; i++) {
            if (n - i >= 0) {
                count += fxn(n - i);
            }
        }
        return count;
    }

    static int fxnMemoization(int n, int[] dp) {
        if (n == 0) return 1;
        if (dp[n] != -1) return dp[n];
        long count = 0;
        long modulo = 1000000007;
        for (int i = 1; i <= 6; i++) {
            if (n - i >= 0) {
                count = (count + fxnMemoization(n - i, dp)) % modulo;
            }
        }
        dp[n] = (int) count;
        return dp[n];
    }
    static int fxnTabulation(int n){
        long m = 1000000007;
        int[] dp = new int[n+1];
        dp[0] = 1;

        for(int i = 1;i<=n;i++){
            long s = 0;
            for(int j=1;j<=6;j++){
                if(i-j>=0){
                    s = (s+dp[i-j])%m;
                }
            }
            dp[i] = (int)s;
        }
        return dp[n];
    }
}