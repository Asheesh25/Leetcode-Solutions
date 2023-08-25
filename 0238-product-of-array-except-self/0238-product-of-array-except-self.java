class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int mul = 1, numZero = 0, index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                numZero++;
                index = i;
            }
            else
                mul*=nums[i];
        }
        if(numZero==0)
            for(int i=0;i<nums.length;i++)
                ans[i] = mul/nums[i];
        else if(numZero == 1)
            ans[index] = mul;
        return ans;  
    }
}