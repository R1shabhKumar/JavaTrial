// 35. write a java program to check if a number is a perfect square
public class PerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        if(isPerfectSquare(num)){
            System.out.println(num+" is a perfect square.");
        }
        else{
            System.out.println(num+" is not a perfect square.");
        }
    }

    public static boolean isPerfectSquare(int num){
        int sqrt = (int)Math.sqrt(num);
        return sqrt*sqrt == num;
    }
}
