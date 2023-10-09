class Solution {
    public int maxCoins(int[] piles) {
        int ans = 0;
        Arrays.sort(piles);
        int a = piles.length/3;
        for(int i=piles.length-2;a!=0;i-=2){
            ans+=piles[i];
            a--;
        }
        return ans;
    }
}