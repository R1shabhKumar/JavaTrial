import java.util.Scanner;

public class Weird1 {
    public static void weird(long n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        while(n!=1){
            if(n%2==0){
                n = n/2;
                System.out.print(n+" ");
            }else{
                n = 3*n + 1;
                System.out.print(n+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        weird(n);
    }
}
