// 4. write a java program to check if a string is a rotation of another string
import java.util.Scanner;

public class StringRotation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter thes second string: ");
        String str2 = sc.nextLine();

        boolean result = isRotation(str1,str2);
        System.out.println(result);
    }
    public static boolean isRotation(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        String temp = str1+str1;
        return temp.contains(str2);
    }
}
