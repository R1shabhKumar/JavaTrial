import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfTwoValues3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        Map<Integer, Integer> valueToIndex = new HashMap<>();

        for(int i=0;i<n;i++){
            valueToIndex.put(a[i],i);
        }
        Arrays.sort(a);
        int low = 0,high = n-1;
        while(low<high){
            int currentSum = a[low] + a[high];
            if(currentSum==sum){
                int first = valueToIndex.get(a[low])+1;
                int second = valueToIndex.get(a[high])+1;

                    System.out.println(second+" "+first);


                return;
            }else if(currentSum<sum){
                low++;
            }else{
                high--;
            }

        }

        System.out.println("IMPOSSIBLE");
        scanner.close();
    }
}
