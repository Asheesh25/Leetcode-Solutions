class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        for(int i=0;i<32;i++){
            int countZero = 0;
            for(int num:nums){
                countZero+=(num>>i)&1;
            }
            ans+=countZero*(nums.length-countZero);
        }
        return ans;
    }
}