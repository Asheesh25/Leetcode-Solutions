class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        for(int i=0;i<32;i++){
            int countOne = 0;
            for(int num:nums){
                countOne+=(num>>i)&1;
            }
            ans+=countOne*(nums.length-countOne);
        }
        return ans;
    }
}