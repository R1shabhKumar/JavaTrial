// 41. write a java program to find the GCD(Greatest Common Divisor) of two numbers
public class GCD {
    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 98;

        System.out.println("GCD of "+num1+" and "+num2+" is: "+findGCD(num1,num2));
    }

    public static int findGCD(int num1, int num2){
        if(num2==0){
            return num1;
        }
        return findGCD(num2, num1%num2);
    }
}
