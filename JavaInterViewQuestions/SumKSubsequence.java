import java.util.ArrayList;

public class SumKSubsequence {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int k = 5;
        ArrayList<Integer> current = new ArrayList<>();
        occurences(arr,k,0,current);
    }
    public static void occurences(int[] arr,int k,int index,ArrayList<Integer> current){
        if(index==arr.length){
            if(k==0) System.out.println(current);
            return;
        }

        current.add(arr[index]);
        k -= arr[index];
        occurences(arr,k,index+1,current);

        k+=arr[index];
        current.removeLast();
        occurences(arr,k,index+1,current);


    }
}
