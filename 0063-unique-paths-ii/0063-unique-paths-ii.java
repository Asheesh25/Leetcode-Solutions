class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int [][] ans = new int[n][m];
        for(int i = 0;i<n;i++){
            if(obstacleGrid[i][0] == 0) ans[i][0] = 1;
            else break;
        }
        for(int j = 0;j<m;j++){
            if(obstacleGrid[0][j] == 0) ans[0][j] = 1;
            else break;
        }

        for(int i = 1;i<n;i++){
            for(int j = 1;j<m;j++){
                if(obstacleGrid[i][j]==0) ans[i][j] = ans[i-1][j]+ans[i][j-1];
            }
        }
        return ans[n-1][m-1];
    }
}