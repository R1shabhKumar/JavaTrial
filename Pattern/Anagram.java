import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.next();
        System.out.println("Enter the second string: ");
        sc.nextLine();
        String str2 = sc.next();
        
        str1=str1.replace(" ","");
        str2=str2.replace(" ","");
        
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        
        char ar1[]=str1.toCharArray();
        char ar2[]=str2.toCharArray();
        
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        
        if(Arrays.equals(ar1,ar2)){
            System.out.println("Anagram!");
        }else{
            System.out.println("Not Anagram!");
        }
    }
}