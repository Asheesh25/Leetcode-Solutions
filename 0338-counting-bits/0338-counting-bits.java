class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<ans.length;i++){
            String str = Integer.toBinaryString(i);
            ans[i] = (int)count(Long.parseLong(str));
        }
        return ans;
    }
    int count(long ele){
        int ans = 0;
        while(ele!=0){
            if(ele%10==1)
                ans++;
            ele/=10;
        }
        return ans;
    }
}