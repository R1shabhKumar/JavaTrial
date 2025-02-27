// write a java program using recursion to find the Nth Fibonacci number
public class NthFibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The "+n+"th Fibonacci number is: "+fib(n));
    }

    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
