import java.util.*;
class Guesser{
    int guessNum;
    public int guessingNumber(){
        guessNum = (int)((Math.random())*10);
        return guessNum;
    }
}
class Player{
    int guessNum;
    int guessingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player! kindly guess your number between 0 and 10");
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    int score1;
    int score2;
    int score3;

    void collectFromGuesser(){
        Guesser g = new Guesser();
        numFromGuesser=g.guessingNumber();
    }
    void collectFromPlayer(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }
    void score(){
        if(score1==score2&&score1==score3&&score1!=0){
            System.out.println("Match tied at score "+score1+" nobody won!!!");
        }else if(score1>score2){
            if(score1>score3){
                System.out.println("Player 1 won by scoring "+score1);
            }else if(score1==score3){
                System.out.println("Player 1 and Player 3 both won by scoring "+score1);
            }else{
                System.out.println("Player 3 won by scoring "+score3);
            }
        }else if(score1>score3){
            if(score1>score2){
                System.out.println("Player 1 won by scoring "+score1);
            }else if(score1==score2){
                System.out.println("Player 1 and Player 2 both won by scoring "+score1);
            }else{
                System.out.println("Player 2 won by scoring "+score2);
            }
        }else if(score1==score2&&score3!=0){
            if(score1>score3){
                System.out.println("Player 1 and Player 3 won by scoring "+score1);
            }else{
                System.out.println("Player 3 won by scoring "+score3);
            }
        }else if(score1==score3&&score2!=0){
            if(score1>score2){
                System.out.println("Player 1 and Player 3 won by scoring "+score1);
            }else{
                System.out.println("Player 2 won by scoring "+score2);
            }
        }else if(score2==score3&&score1!=0){
            if(score2>score1){
                System.out.println("Player 2 and Player 3 won by scoring "+score2);
            }else{
                System.out.println("Player 1 won by scoring "+score1);
            }
        }else if(score2>score3){
            if(score2>score1){
                System.out.println("Player 2 won by scoring "+score2);
            }else{
                System.out.println("Player1 won by scoring "+score1);
            }
        }else if(score3>score1){
            if(score3>score2){
                System.out.println("Player 3 won by scoring "+score3);
            }else{
                System.out.println("Player 2 won by scoring "+score2);
            }
        }else if(score1==score2&&score1==score3&&score3==0){
            System.out.println("Nobody won!! Everyone scored 0");
        }
    }
    void compare(){
        
        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
            System.out.println("Everybody won this round by guesssing the number "+numFromGuesser);
            score1++;
            score2++;
            score3++;
            }
            else if(numFromGuesser==numFromPlayer2){
                System.out.println("Player 1 and Player 2 both won the round by guessing the number "+numFromGuesser);
                score1++;
                score2++;
            }
            else if(numFromGuesser==numFromPlayer3){
                System.out.println("Player1 and Player 3 both won the round by guessing the number "+numFromGuesser);
                score1++;
                score3++;
            }else{
                System.out.println("Player 1 won the round by guessing the number "+numFromGuesser);
                score1++;
            }
            
        }
        else if(numFromGuesser==numFromPlayer2){
            if(numFromGuesser==numFromPlayer3){
                System.out.println("Player 2 and Player 3 both won the round by guessing the number "+numFromGuesser);
                score2++;
                score3++;
            }else{
                System.out.println("Player 2 won the round by guessing the number "+numFromGuesser);
                score2++;
            }
            
        }
        else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player 3 won the round by guessing the number "+numFromGuesser);
            score3++;
        }
        else{
            System.out.println("Nobody won!! the right answer is "+numFromGuesser);
        }
    }
}
public class Guessergame {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        for(int i=0;i<2;i++){
            System.out.println("Game started");
            System.out.println("Round "+(i+1));
            
            u.collectFromGuesser();
            u.collectFromPlayer();
            u.compare();
            System.out.println();
        }
    u.score();    
    }
}

