import java.util.*;
public class Pangram {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str= sc.nextLine();
        str = str.replace(" ", "");  //remove whitespaces
        str=str.toLowerCase();  //convert the string to lowercase
        str=str.trim();  //remove whitespaces from both ends
        System.out.println(str);
        char ch[] = str.toCharArray();  //store the string in a character array
        
        int arr[] = new int[26];   //create an array with 26 size for a letter at each index with value 0

        for(int i=0;i<ch.length;i++){
            arr[ch[i]-97]++;  //subtract 65 in case the string is converted to uppercase
        }                     //increase the elements in arr by 1 if found in ch array
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]==0){  //check if the value at index related to any letter is 0
                System.out.println("Not a pangram");
                flag = true;
                break;  //stop the loop
            }
        }
        if (flag==false) {
            System.out.println("It is a pangram");
        } 
    }
}
