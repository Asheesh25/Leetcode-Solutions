 class Solution {
    public int[] findPeakGrid(int[][] mat) {
        if(mat.length == 1)
            return new int[]{0,max(mat[0])};
        int rowStart = 0, rowEnd = mat.length-1;
        while(rowStart<=rowEnd){
            int mid = rowStart + (rowEnd-rowStart)/2;
            int index = max(mat[mid]);
            if(mid == 0){
                if(mat[mid][index]>mat[mid+1][index])
                    return new int[]{mid,index};
            }
            if(mid == mat.length-1){
                if(mat[mid][index]>mat[mid-1][index])
                    return new int[]{mid,index};
            }
            if(mat[mid][index]>mat[mid+1][index] && mat[mid][index]>mat[mid-1][index])
                return new int[]{mid,index};
            if(mat[mid][index]<mat[mid+1][index])
                rowStart = mid+1;
            else
                rowEnd = mid-1;
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