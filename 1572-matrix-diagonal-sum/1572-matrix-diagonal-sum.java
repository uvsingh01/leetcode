class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        for(int i=0; i<mat.length; i++){
            sum=sum+mat[i][i];
            sum=sum+mat[i][mat.length-1-i];
        }
        if(mat.length%2==1){
            return sum-mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}