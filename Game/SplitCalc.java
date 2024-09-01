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
    double spend1,spend2,spend3,spend4,Spend,avg;
    

    void book(int x,int y,int z){
        User u1 = new User();
        Id = u1.getId();
        Spend = u1.getUserSpend();
        if(x==0&&y==0&&z==0){
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
        }else if(x==1){
            if(Id==2){
                spend2 = spend2 +Spend;
            }else if(Id==3){
                spend3 = spend3 +Spend;
            }
            else if(Id==4){
                spend4 = spend4 +Spend;
            }
        }else if(x==2){
            if(Id==1){
                spend1 = spend1 +Spend;
            }else if(Id==3){
                spend3 = spend3 +Spend;
            }
            else if(Id==4){
                spend4 = spend4 +Spend;
            }
        }else if(x==3){
            if(Id==1){
                spend1 = spend1 +Spend;
            }else if(Id==2){
                spend2 = spend2 +Spend;
            }
            else if(Id==4){
                spend4 = spend4 +Spend;
            }
        }else if(x==4){
            if(Id==1){
                spend1 = spend1 +Spend;
            }else if(Id==2){
                spend2 = spend2 +Spend;
            }else if(Id==3){
                spend3 = spend3 +Spend;
            }
        }else if(y==3&&z==4){
            if(Id==1){
                spend1 = spend1 +Spend;
            }else if(Id==2){
                spend2 = spend2 +Spend;
            }
        }else if(y==2&&z==4){
            if(Id==1){
                spend1 = spend1 +Spend;
            }else if(Id==3){
                spend3 = spend3 +Spend;
            }
        }else if(y==2&&z==3){
            if(Id==1){
                spend1 = spend1 +Spend;
            }else if(Id==4){
                spend4 = spend4 +Spend;
            }
        }else if(y==1&&z==4){
            if(Id==2){
                spend2 = spend2 +Spend;
            }else if(Id==3){
                spend3 = spend3 +Spend;
            }
        }else if(y==1&&z==3){
            if(Id==2){
                spend2 = spend2 +Spend;
            }else if(Id==4){
                spend4 = spend4 +Spend;
            }
        }else if(y==1&&z==2){
            if(Id==3){
                spend3 = spend3 +Spend;
            }
            else if(Id==4){
                spend4 = spend4 +Spend;
            }
        }
        
        
    }
    double average(int n){
    avg = (spend1+spend2+spend3+spend4)/n;
    return avg;
    }
    double round1,round2,round3,round4;
    double r1,r2,r3,r4;
    double roundAverage;
    
    void rSpend(int r,int s,int t,double roundAverage){
    
        if(r==0&&s==0&&t==0){
            r1=(spend1-roundAverage);
            r2=(spend2-roundAverage);
            r3=(spend3-roundAverage);
            r4=(spend4-roundAverage);
            round1=round1+r1;
            round2=round2+r2;
            round3=round3+r3;
            round4=round4+r4; 
            r1=0;r2=0;r3=0;r4=0;
            }else if(r==1){
            r2=(spend2-roundAverage);
            r3=(spend3-roundAverage);
            r4=(spend4-roundAverage);
            round2=round2+r2;
            round3=round3+r3;
            round4=round4+r4; 
            r2=0;r3=0;r4=0;
        }else if(r==2){
            r1=(spend1-roundAverage);
            r3=(spend3-roundAverage);
            r4=(spend4-roundAverage);
            round1=round1+r1;
            round3=round3+r3;
            round4=round4+r4; 
            r1=0;r3=0;r4=0;
        }else if(r==3){
            r1=(spend1-roundAverage);
            r2=(spend2-roundAverage);
            r4=(spend4-roundAverage);
            round1=round1+r1;
            round2=round2+r2;
            round4=round4+r4; 
            r1=0;r2=0;r4=0;
        }else if(r==4){
            r1=(spend1-roundAverage);
            r2=(spend2-roundAverage);
            r3=(spend3-roundAverage);
            round1=round1+r1;
            round2=round2+r2;
            round3=round3+r3;  
            r1=0;r2=0;r3=0;
            }else if(s==1&&t==2){
            r3=(spend3-roundAverage);
            r4=(spend4-roundAverage);
            round3=round3+r3;
            round4=round4+r4; 
            r3=0;r4=0;
        }else if(s==3&&t==4){
            r1=(spend1-roundAverage);
            r2=(spend2-roundAverage);
            round1=round1+r1;
            round2=round2+r2;
            r1=0;r2=0; 
            }else if(s==2&&t==4){
            r1=(spend1-roundAverage);
            r3=(spend3-roundAverage);
            round1=round1+r1;
            round3=round3+r3;
            r1=0;r3=0; 
        }else if(s==2&&t==3){
            r1=(spend1-roundAverage);
            r4=(spend4-roundAverage);
            round1=round1+r1;
            round4=round4+r4; 
            r1=0;r4=0;
        }else if(s==1&&t==4){
            r2=(spend2-roundAverage);
            r3=(spend3-roundAverage);
            round2=round2+r2;
            round3=round3+r3;
            r2=0;r3=0; 
        }else if(s==1&&t==3){
            r2=(spend2-roundAverage);
            r4=(spend4-roundAverage);
            round2=round2+r2;
            round4=round4+r4; 
            r2=0;r4=0;
        }
    

    }    
    void show(){
        System.out.println("Balance 1: "+round1);
        System.out.println("Balance 2: "+round2);
        System.out.println("Balance 3: "+round3);
        System.out.println("Balance 4: "+round4);
    }
    
}


public class SplitCalc{
    public static void main(String[] args) {
        int entries,rounds;
        int members;
        int abs=0,abs1=0,abs2=0;
        Calculator c = new Calculator();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rounds: ");
        rounds=sc.nextInt();
        for(int i=0;i<rounds;i++){
            System.out.println("Enter the number of members:");
            members = sc.nextInt();
            if(members==3){
                System.out.println("Enter the absentee Id:");
                abs = sc.nextInt();
            }else if(members ==2){
                System.out.println("Enter the absentee Ids: ");
                abs1=sc.nextInt();
                abs2=sc.nextInt();
            }
            System.out.println("Enter the number of entries: ");
            entries = sc.nextInt();
            
            for(int j=0;j<entries;j++){
            
                c.book(abs,abs1,abs2);
            }
            double A = c.average(members);
            c.rSpend(abs,abs1,abs2,A);
            c.spend1=0;
            c.spend2=0;
            c.spend3=0;
            c.spend4=0;
            c.r1=0;
            c.r2=0;
            c.r3=0;
            c.r4=0;
            abs=0;
            abs1=0;
            abs2=0;
            
        }
        
        c.show();
    }
}
