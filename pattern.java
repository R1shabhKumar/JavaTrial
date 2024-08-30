//This code is used to print my name using stars in pattern
public class pattern {
    public static void main(String[] args){
        int n=10;
        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++){
            //for printing "R"
            for(int j=0;j<n;j++){
                if(i==0||i==(n-1)/2||j==0||j==(n-1)&&i<=(n-1)/2||i-j==(n+1)/2){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");//Used for space between the figures
            //for printing "I"
            for(int j=0;j<n;j++){
                if(j==(n+1)/2){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
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
            //for printing "H"
            for(int j=0;j<n;j++){
                if(i==(n+1)/2||j==0||j==n-1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.print(" ");
            //for printing "A"
            for(int j=0;j<n;j++){
                if(i==0||i==(n+1)/2||j==0||j==n-1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.print(" ");
            //for printing "B"
            for(int j=0;j<n;j++){
                if(i==0||i==(n+1)/2||i==n-1||j==0||j==n-1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.print(" ");
            //for printing "H" again
            for(int j=0;j<n;j++){
                if(i==(n+1)/2||j==0||j==n-1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
