//This code creates a fill pattern using asterisks and spaces.
public class fillpattern {
    public static void main (String[] args){
        int n=11;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==0&&j<=(n-1)/2||j==0&&i<=(n-1)/2||i+j<=(n-1)/2||  //first quarter of the fill
                i==0&&j<=n-1||j==n-1&&i<=(n-1)/2||j-i>=(n-1)/2||        //second quarter of the fill
                j==0&&i>=(n-1)/2||i==n-1&&j<=(n-1)/2||i-j>=(n-1)/2||    //third quarter of the fill
                j==n-1&&i>=(n-1)/2||i==n-1&&j>=(n-1)/2||i+j>=(n-1)+(n-1)/2) {  //fourth quarter of the fill
                    System.out.print("*");    //for the fill using "*"
                }else{
                    System.out.print(" ");    //for creating the hollow space sorrounded by the asteriks fill patterns
                }
            }
            System.out.println();     //for changing lines after the for loop of "j"
        }
    }
}
