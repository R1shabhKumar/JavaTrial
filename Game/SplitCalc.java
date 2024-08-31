import java.util.*;
class User{
    int userId;
    double userSpend;
    int getId(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user ID: ");
        userId = sc.nextInt();
        return userId;
    }
    
    double getUserSpend(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the amount: ");
        userSpend = sc.nextDouble();
        return userSpend;
    }


}
class Calculator{
    int Id;
    double spend1,spend2,spend3,spend4,Spend,average;
    

    void book(){
        User u1 = new User();
        Id = u1.getId();
        Spend = u1.getUserSpend();
        if(Id==1){
            spend1 = spend1 +Spend;
        }else if(Id==2){
            spend2 = spend2 +Spend;
        }else if(Id==3){
            spend3 = spend3 +Spend;
        }
        else if(Id==4){
            spend4 = spend4 +Spend;
        }
    }
    double average(){
    average = (spend1+spend2+spend3+spend4)/4;
    return average;
    }
    void show(){
        System.out.println("Avearage spend :"+average);
        System.out.println("Balance 1: "+(spend1-average));
        System.out.println("Balance 2: "+(spend2-average));
        System.out.println("Balance 3: "+(spend3-average));
        System.out.println("Balance 4: "+(spend4-average));
    }

}
public class SplitCalc{
    public static void main(String[] args) {
        int entries;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of entries: ");
        entries = sc.nextInt();
        Calculator c = new Calculator();
        for(int i=0;i<entries;i++){
            c.book();
        }
        c.average();
        c.show();
    }
}
