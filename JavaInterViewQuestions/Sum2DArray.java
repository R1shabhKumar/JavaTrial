// 17. write a java program to calculate the sum of all elements in a 2D array
public class Sum2DArray {
    public static void main(String[] args) {
        int[][] arr = {{4,1,3},{2,6,4},{5,7,9}};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
        }
        System.out.println("sum = "+sum);
    }
}
