import java.util.ArrayList;

public class LC73 {
    public void setZeroes(int[][] matrix) {
    ArrayList<Integer> I = new ArrayList<>();
    ArrayList<Integer> J = new ArrayList<>();
    for(int i = 0;i<matrix.length;i++){
        for(int j = 0;j< matrix[i].length;j++){
            if(matrix[i][j]==0){
                I.add(i);
                J.add(j);
            }
        }
    }
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j< matrix[i].length;j++){
                if(I.contains(i)||J.contains(j)){
                    matrix[i][j] = 0;
                }
            }
    }
}}
