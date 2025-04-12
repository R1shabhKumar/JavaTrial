public class LC2022 {
    public int[][] construct2dArray(int[] original,int m,int n){
        if(m*n>original.length){

            return new int[0][];
        }
        int[][] res = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j] = original[(i+1)*j];
            }
        }
        return res;
    }
}
