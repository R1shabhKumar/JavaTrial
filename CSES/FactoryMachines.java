import java.util.Arrays;
import java.util.Scanner;

public class FactoryMachines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        long res = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        long max = Arrays.stream(arr).max().getAsInt();
        long low = 0;
        long high = max *t;


        while(low<=high){
            long mid = low+(high-low)/2;
            if(possible(mid,arr,t,n)){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(res);
    }
    static boolean possible(long mid,int[] arr,int t,int n){
        long temp = 0;
        for(int i=0;i<n;i++){
            temp += (mid/arr[i]);
            if(temp>=t) return true;
        }
        return false;
    }
}
