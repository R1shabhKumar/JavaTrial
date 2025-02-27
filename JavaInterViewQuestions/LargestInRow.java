// 27. write a java program to find the largest element in each row of a 2D array
public class LargestInRow {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<arr.length;i++){
            int max = arr[i][0];
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
            System.out.println("Largest element in row "+(i+1)+" is: "+max);
        }
    }
}
