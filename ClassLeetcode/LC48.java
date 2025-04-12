public class LC48 {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<i;j++){
                matrix[i][j] = matrix[j][i];
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] = temp;
            }
        }
    }
}
