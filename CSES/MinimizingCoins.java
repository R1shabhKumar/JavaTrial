import java.util.Arrays;
import java.util.Scanner;

public class MinimizingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] dp = new int[x+1];
        Arrays.fill(dp,-1);
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(fxnMemoization(n,x,arr,dp));
    }

    static int fxn(int n,int x,int[] arr){
        if(x==0) return 0;

        long res = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                res = Math.min(res,1+fxn(n,x-arr[i],arr));
            }
        }
        return (int)res;
    }
    static int fxnMemoization(int n,int x,int[] arr,int[] dp){
        if(x==0) return 0;
        if(dp[x]!=0) return dp[x];
        long res = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                res = Math.min(res,1+fxnMemoization(n,x-arr[i],arr,dp));
            }
        }
        return dp[x] = (int)res;

    }
}
