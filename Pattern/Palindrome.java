import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Taking user input and creating an array
        System.out.println("Enter the size of the array..");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements....");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //checking for palindrome
        int flag = 0;
        for(int k=0;k<size/2;k++){
            if(arr[k] != arr[size-k-1] ){
                flag = 1;
                System.out.println("Not a palindrome!!!!");
                break;
            }
            
        }
        if(flag==0){
            System.out.println("It's a palindrome...");
        }
    }
}
