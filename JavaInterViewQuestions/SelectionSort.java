// 36. write a java program to implement selection sort
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {29,10,14,37,13};
        selectionSort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
    
    public static void selectionSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int minIdx = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
