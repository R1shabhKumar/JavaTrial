// 28. write a java program to remove duplicates from an array
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] arr = {1,2,2,3,4,4,5};
        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));

        Integer[] newArr = set.toArray(new Integer[0]);
        System.out.println("Array after removing duplicates: "+Arrays.toString(newArr));
    }
}
