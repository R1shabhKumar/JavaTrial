import java.util.Scanner;

public class Reverse_array {
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

        //Reversing the array
        int temp;
        for (int i = 0; i < size/2; i++) {
        temp = arr[i];
        arr[i] = arr[size-i-1];
        arr[size-i-1] = temp;
        }
        //Printing the reversed array
        System.out.print("The reversed array is: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}
