public class LC1314 {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] answer = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               function(answer,mat,i,j,k);
            }
        }
        return answer;
    }
    public static void function(int[][] answer,int[][]mat,int i,int j,int k){
        int r1 = i-k,r2 = i+k;
        if(r1<0) r1=0;
        if(r2>=mat.length) r2 = mat.length-1;

        int c1 = j-k,c2 = j+k;
        if(c1<0) c1=0;
        if(c2>=mat[0].length) c2 = mat[0].length-1;

        for(int x= r1;x<=r2;x++){
            int sum = 0;
            for(int y = c1; y<=c2;y++){
                sum += mat[x][y];
            }
            answer[i][j]  = sum;
        }

    }
}
