class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            //primary diagonal(left)  i==j
            sum+=mat[i][i];

            //secondary diagonal(right)  i+j=n-1, i=n-i-1
            if(i!=mat.length-i-1){
                sum+=mat[i][mat.length-i-1];
            }
        }
        return sum;
    }
}