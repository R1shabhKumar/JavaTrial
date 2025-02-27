// 3. Write a java program to reverse a string

public class ReverseString {
    public static void main(String[] args) {
        String str = "java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: "+reversed);
    }
}
