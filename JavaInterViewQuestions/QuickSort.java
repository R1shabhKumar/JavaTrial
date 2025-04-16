import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,7,6,9,1};
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void qs(int[] arr,int low, int high){
        if(low<high){
            int pivotIndex = partition(arr,low,high);
            qs(arr,low,pivotIndex-1);
            qs(arr,pivotIndex+1,high);
        }
    }

    static int partition(int[] arr, int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot&&i<=high-1) i++;
            while(arr[j]>pivot&&j>=low+1) j--;
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);

        return j;
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
