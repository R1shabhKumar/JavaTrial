// 6,16. write a java program to find the largest number in an array

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {10,20,5,40,25};
        int max = arr[0];
        for(int num:arr){
            if(num>max){
                max= num;
            }
        }
        System.out.println("Largest number in the array is "+max);
    }
}
