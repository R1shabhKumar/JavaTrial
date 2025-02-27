// 31. write a java program to implement binary search
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 30;
        Arrays.sort(arr); //Binary search requires a sorted array
        int index = binarySearch(arr,target,0,arr.length-1);
        if(index== -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: "+index);
        }
        
    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;

        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binarySearch(arr, target, low, mid-1);
        }else{
            return binarySearch(arr, target, mid+1, high);
        }
    }
}
