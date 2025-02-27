// 23,26. write a java program to find the intersection of two arrays
import java.util.HashSet;

public class IntersectionArrays {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        HashSet<Integer> set = new HashSet<>();
        for(int i :arr1){
            set.add(i);
        }

        System.out.print("Intersection: ");
        for(int i : arr2){
            if(set.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
