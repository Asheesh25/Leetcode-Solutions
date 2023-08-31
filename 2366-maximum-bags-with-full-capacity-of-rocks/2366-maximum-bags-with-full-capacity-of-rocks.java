class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int ans = 0;
        int[] remaining = new int[capacity.length];
        for(int i=0;i<capacity.length;i++){
            remaining[i] = capacity[i]-rocks[i];
            if(remaining[i]==0)
                ans+=1;
        }
        Arrays.sort(remaining);
        for(int num:remaining){
            if(num == 0)
                continue;
            if(additionalRocks>=num){
                ans++;
                additionalRocks-=num;
            }
        }
        return ans;
    }
}