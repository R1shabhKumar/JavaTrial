import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Test {

    static void occurences(List<Integer> ans,int[] arr, int index){
        int n = arr.length;
        if(index>=n){
            System.out.println(ans);
            return;
        }
        ans.add(arr[index]);
        occurences(ans,arr,index+1);
        ans.removeLast();
        occurences(ans,arr,index+1);
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> ans = new ArrayList<>();
        occurences(ans,arr,0);
    }
}
