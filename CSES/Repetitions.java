import java.util.Scanner;

public class Repetitions {
    public static int fxn(String str){
        int i=0,j=0;
        int n = str.length();
        int max = 0;

        while(j<n){
            if(str.charAt(i)==str.charAt(j)){
                j++;
                max = Math.max(j-i,max);
            }else{
                i++;

            }

        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(fxn(str));
    }
}
