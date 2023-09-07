class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = 0, a = start^goal;
        while(a!=0){
            if((a&1) == 1)
                ans++;
            a = a>>1;
        } 
        return ans;
    }
}