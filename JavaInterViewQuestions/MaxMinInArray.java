// 24. write a java program to find an array's maximum and minimum number
public class MaxMinInArray {
    public static void main(String[] args) {
        int[] arr = {10,20,5,25,15};
        int max = arr[0] , min = arr[0];
        
        for(int num : arr){
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);
    }
}
