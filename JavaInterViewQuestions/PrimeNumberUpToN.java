// 9. write a java program to print all prime numbers upto n
public class PrimeNumberUpToN {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        System.out.print("Prime numbers upto "+n+": ");
        for(int i = 2; i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total prime numbers upto "+n+": "+count);
    }

    public static boolean isPrime(int num){
        for(int i = 2;i<=num/2;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
