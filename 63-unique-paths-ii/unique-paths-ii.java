class Solution {
    public int uniquePathsWithObstacles(int[][] og) {
        if (og == null || og[0][0] == 1) return 0;
        int m = og.length;
        int n = og[0].length;
        int [][] dp = new int[m+1][n+1];
        for(int i = 0; i < m; i++){
            if(og[i][0] == 1) break;
            dp[i][0] = 1;
        } 
        for(int i = 0; i < n; i++){
            if(og[0][i] == 1) break;
            dp[0][i] = 1;
        }

        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(og[i][j] == 0){
                 dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}