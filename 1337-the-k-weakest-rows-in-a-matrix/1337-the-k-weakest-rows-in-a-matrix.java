class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[1]!=b[1]?a[1]-b[1]:a[0]-b[0]);
        
        for(int i=0;i<mat.length;i++){
            int count = 0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=1)
                    break;
                count++;
            }
            q.offer(new int[]{i,count});
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
            ans[i] = q.poll()[0];
        return ans;
        
    }
}