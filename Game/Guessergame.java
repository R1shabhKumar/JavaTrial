import java.util.*;
class Guesser{  //class for automatically generating the number between 0 and 10
    int guessNum;  //variable storing the random number
    public int guessingNumber(){    //method for generating the number
        guessNum = (int)((Math.random())*10);
        return guessNum;
    }
}
class Player{   //class for the actual players giving their guesses as input
    int guessNum;  //variable for storing the number guessed by the player
    int guessingNumber(int n){  //method of getting the guess from the user as input
        Scanner sc = new Scanner(System.in);
        System.out.println("Player "+n+" kindly guess your number between 0 and 10");
        guessNum = sc.nextInt();
        return guessNum;
        }
    }
class Umpire{   //class for getting the input from Player class and comparing from the random number from Guesser class
    int numFromGuesser;   //variable storing random number generated in the Guesser class
    int numFromPlayer1;   //variable storing input from player1 
    int numFromPlayer2;   //variable storing input from player2
    int numFromPlayer3;   //variable storing input from player3
    int score1;           //storing score after every round for player1
    int score2;           //storing score after every round for player2
    int score3;           //storing score after every round for player3

    void collectFromGuesser(){  //method for collecting random number from Guesser
        Guesser g = new Guesser();  //creating a new object of Guesser
        numFromGuesser=g.guessingNumber();  //accessing a method from Guesser using the object
    }
    void collectFromPlayer(){    //method for collecting user input from Player
        Player p1 = new Player();  //creating new method
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber(1);  //accessing a method from Player using the object
        numFromPlayer2 = p2.guessingNumber(2);
        numFromPlayer3 = p3.guessingNumber(3);
    }
    void score(){    //method for calculating and displaying the winner after the completion of the game 
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
    void compare(){  //method for calculating the score and displaying the winner of the round
        
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
    void logo(){
        //Printing "GUESS" made using asterix and whitespaces
        int n=11;
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            //for printing "G"
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1&&j<(n-1)/2||j==(n-1)/2&&i>(n-1)/2||i==(n-1)/2&&j>(n-1)/2||j==n-1&&i>(n-1)/2){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.print(" ");//Used for space between the figures
            //for printing "U"
            for(int j=0;j<n;j++){
                if(j==0||j==n-1||i==n-1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.print(" ");

            //for printing "E"
            for(int j=0;j<n;j++){
                if (i==0||j==0||i==n-1||i==(n-1)/2) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.print(" ");
            //for printing "S"
            for(int j=0;j<n;j++){
                if(i==0||j==0&&i<=(n+1)/2||i==(n+1)/2||i==n-1||j==n-1&&i>=(n+1)/2){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.print(" ");
            //for printing "S"
            for(int j=0;j<n;j++){
                if(i==0||j==0&&i<=(n+1)/2||i==(n+1)/2||i==n-1||j==n-1&&i>=(n+1)/2){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.print(" ");
            //for printing "E"
            for(int j=0;j<n;j++){
                if (i==0||j==0||i==n-1||i==(n-1)/2) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.print(" ");
            //for printing "R"
            for(int j=0;j<n;j++){
                if(i==0||i==(n-1)/2||j==0||j==(n-1)&&i<=(n-1)/2||i-j==(n+1)/2){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("X*****X*****X*****X*****X*****X*****X*****X*****X*****X*****X*****X*****X*****X*****X");
        System.out.println();
        System.out.println("                           This game is made by RISHABH");
        System.out.println();
        System.out.println("X*****X*****X*****X*****X*****X*****X*****X*****X*****X*****X*****X*****X*****X*****X");
        System.out.println();
    }
}
public class Guessergame {   //public class
    public static void main(String[] args) {   //main function
        int rounds;  //variable for storing the number of rounds entered by user
        Scanner sc = new Scanner(System.in);
        Umpire u = new Umpire();   //creating  new object
        u.logo();
        System.out.print("Enter the number of rounds you want to play: ");
        rounds = sc.nextInt();
        System.out.println();
        System.out.println("Game started");
        for(int i=0;i<rounds;i++){   //using for loop for multiple rounds according to the user input
            System.out.println("Round "+(i+1));
            u.collectFromGuesser(); //accessing a method from Umpire using the object
            u.collectFromPlayer();
            u.compare();
            System.out.println();
        }
    u.score();    //accessing this method from Umpire to display the final result of the game
    }
}

