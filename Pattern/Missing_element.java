import java.util.Scanner;

public class Missing_element {
    public static void main(String[] args) {
        //Taking user input and creating the sample array
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
        //finding the missing element
        int sumOfNaturalNumbers = (n*(n+1))/2;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum +=arr[i];
        }
        int missing = sumOfNaturalNumbers - sum;
        System.out.println("The missing number is "+missing);
    }
}
