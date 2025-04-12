import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Weird2 {


    public static void weird(long n) {


        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                System.out.print(n+" ");
            } else {
                n = (n * 3) + 1;
                System.out.print(n+" ");
            }

        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        weird(n);
    }
}
