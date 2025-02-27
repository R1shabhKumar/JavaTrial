// 2,13. write a java program to sort an array using the Bubble Sort algorithm

import java.util.Arrays;
public class BubbleSort {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {20,13,15,21,5,11};
        int[] arr2 = {64,34,25,12,22,11,90};
        sort(arr1);
        sort(arr2);
        System.out.println("Sorted Array: "+Arrays.toString(arr2)); //printing in form of an array
        for(int i=0;i<arr1.length;i++){    //for printing the array in conventional style
            System.out.print(arr1[i]+" ");
        }
    }
}
