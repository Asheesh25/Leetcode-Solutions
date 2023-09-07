class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = 0, a = start^goal;
        while(a!=0){
            int rem = a%2;
            if(rem == 1)
                ans++;
            a/=2;
        } 
        return ans;
    }
}