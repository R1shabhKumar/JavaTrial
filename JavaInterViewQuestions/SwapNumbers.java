// 32. write a java program to swap two numbers without using a temporary variable
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swapping: a= "+a+" b= "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping: a= "+a+" b= "+b);
    }
}
