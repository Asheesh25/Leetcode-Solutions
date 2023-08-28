 class Solution {
    public int[] findPeakGrid(int[][] mat) {
        if(mat.length == 1)
            return new int[]{0,max(mat[0])};
        for(int i=0;i<mat.length;i++){
            int index = max(mat[i]);
            if(i == 0){
                if(mat[i][index]>mat[i+1][index])
                    return new int[]{i,index};
            }
            if(i == mat.length-1){
                if(mat[i][index]>mat[i-1][index])
                    return new int[]{i,index};
            }
            if(mat[i][index]>mat[i+1][index] && mat[i][index]>mat[i-1][index])
                return new int[]{i,index};
        }
        return null;
    }
    int max(int[] mat){
        int ans = -1,index = -1;
        for(int i=0;i<mat.length;i++)
            if(mat[i]>ans){
                ans = mat[i];
                index = i;
            }
        return index;
    }
}