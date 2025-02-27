// 34. write a java program to find the factorial of a number using recursion
public class FactorialRecursion {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of "+num+" is: "+factorial(num));
    }

    public static int factorial(int num){
        if(num==0 ||num ==1){
            return 1;
        }
        return num * factorial(num-1);
    }
}
