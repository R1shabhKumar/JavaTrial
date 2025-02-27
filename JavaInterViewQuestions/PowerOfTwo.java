// 30. write a java program to check if a number is a power of two
public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 16;
        boolean result = isPowerOfTwo(num);
        if(result){
            System.out.println(num+" is a power of two.");
        }else{
            System.out.println(num+" is not a power of two.");
        }
    }

    public static boolean isPowerOfTwo(int num){
        if(num<=0){
            return false;
        }
        return (num & (num-1)) == 0;
    }
}
