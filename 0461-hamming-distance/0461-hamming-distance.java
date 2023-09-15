class Solution {
    public int hammingDistance(int x, int y) {
        int ans = 0;
        for(int i=0;i<32;i++){
            int a = (x>>i & 1) ^ (y>>i & 1);
            if(a == 1)
                ans++;
        }
        return ans;
    }
}