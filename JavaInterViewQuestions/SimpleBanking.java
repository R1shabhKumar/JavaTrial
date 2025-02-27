// 12. write a java program to implement a simple banking system(deposit and withdraw)
import java.util.Scanner;

public class SimpleBanking {
    private double balance;

    public SimpleBanking() {
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: "+amount);
    }

    public void withdraw(double amount){
        if(amount<=balance){
            balance -= amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleBanking account = new SimpleBanking();

        while (true) { 
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                    
                case 3:
                    System.out.println("Current Balance: "+account.getBalance());
                    break;
                    
                case 4:
                    System.out.println("Exiting......");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice. Try again..");    
            }
        }
    }
}
