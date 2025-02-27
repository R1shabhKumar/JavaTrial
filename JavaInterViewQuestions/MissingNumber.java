// 38. write a java program to find the missing number in an array of consecutive numbers 
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int n = arr.length+1;
        int totalSum = n*(n+1)/2;
        int arrSum = 0;

        for(int num:arr){
            arrSum += num;
        }

        int missingNumber = totalSum - arrSum;
        System.out.println("The missing number is: "+missingNumber);
    }
}
