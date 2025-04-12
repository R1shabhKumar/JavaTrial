import java.util.Arrays;
import java.util.Scanner;

public class MissingCoinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        long prefix_sum = 0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]<=prefix_sum+1){
                prefix_sum += arr[i];
            }else{
                System.out.println(prefix_sum+1);
                return;
            }
        }
        System.out.println(prefix_sum+1);
    }
}
