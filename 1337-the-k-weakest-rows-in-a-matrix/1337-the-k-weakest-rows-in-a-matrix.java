class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int len = mat.length;
        int[] arr = new int[len];
        for(int i=0;i<len;i++)
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1)
                    arr[i]++;
                else
                    break;
            }
        int[] temp = Arrays.copyOfRange(arr,0,mat.length);
        Arrays.sort(temp);
        int[] ans = new int[k];
        System.out.print(Arrays.toString(arr)+" "+Arrays.toString(temp));
        for(int i=0;i<k;i++){
            for(int j=0;j<temp.length;j++){
                if(temp[i] == arr[j]){
                    ans[i] = j;
                    arr[j] = -1;
                    break;
                    
                }
            }
        }
        return ans;
    }
}