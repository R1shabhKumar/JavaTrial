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
    void compare(){
        
        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
            System.out.println("Everybody won by guesssing the number "+numFromGuesser);
            }
            else if(numFromGuesser==numFromPlayer2){
                System.out.println("Player 1 and Player 2 both won the game by guessing the number "+numFromGuesser);
            }
            else if(numFromGuesser==numFromPlayer3){
                System.out.println("Player1 and Player 3 both won the game by guessing the number "+numFromGuesser);
            }else{
                System.out.println("Player 1 won the game by guessing the number "+numFromGuesser);
            }
            
        }
        else if(numFromGuesser==numFromPlayer2){
            if(numFromGuesser==numFromPlayer3){
                System.out.println("Player 2 and Player 3 both won the game by guessing the number "+numFromGuesser);
            }else{
                System.out.println("Player 2 won the game by guessing the number "+numFromGuesser);
            }
            
        }
        else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player 3 won the game by guessing the number "+numFromGuesser);
        }
        else{
            System.out.println("Nobody won!! the right answer is "+numFromGuesser);
        }
    }
}
public class Guessergame {
    public static void main(String[] args) {
        System.out.println("Game started");
        Umpire u = new Umpire();
        u.collectFromGuesser();
        u.collectFromPlayer();
        u.compare();
    }
}

