// 42. write a java program to find the LCM(Lowest Common Multiple) of two numbers 
public class LCM {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        System.out.println("LCM of "+num1+" and "+num2+" is: "+findLCM(num1,num2));
    }

    public static int findLCM(int num1,int num2){
        return (num1*num2)/findGCD(num1,num2);
    }

    public static int findGCD(int num1, int num2){
        if(num2==0){
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }
}
